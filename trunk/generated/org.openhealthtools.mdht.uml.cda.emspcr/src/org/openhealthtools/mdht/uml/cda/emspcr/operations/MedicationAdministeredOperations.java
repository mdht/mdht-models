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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivityOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Administered</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationNotAdministeredEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Not Administered Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredResponseRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Response Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationComplicationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Complication Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationPriorAdministrationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Prior Administration Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationPerformerParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Performer Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationAuthorizationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Authorization Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationAdministrationDeviceParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Administration Device Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationAdministeredOperations extends MedicationActivityOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected MedicationAdministeredOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredMedicationNotAdministeredEntryRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Not Administered Entry Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationNotAdministeredEntryRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_NOT_ADMINISTERED_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredMedicationNotAdministeredEntryRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Not Administered Entry Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationNotAdministeredEntryRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_NOT_ADMINISTERED_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredMedicationNotAdministeredEntryRelationship(
			MedicationAdministered medicationAdministered, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_NOT_ADMINISTERED_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_NOT_ADMINISTERED_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_NOT_ADMINISTERED_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_NOT_ADMINISTERED_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_MEDICATION_NOT_ADMINISTERED_ENTRY_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredMedicationNotAdministeredEntryRelationship"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredMedicationConsumable(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Consumable</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationConsumable(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredMedicationConsumable(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Consumable</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationConsumable(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredMedicationConsumable(
			MedicationAdministered medicationAdministered, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_MEDICATION_CONSUMABLE,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredMedicationConsumable"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredResponseRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Response Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #validateMedicationAdministeredResponseRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationAdministeredResponseRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Response Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationAdministeredResponseRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationAdministeredResponseRelationship(
			MedicationAdministered medicationAdministered, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ADMINISTERED_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_RESPONSE_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredResponseRelationship"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationAdministeredMedicationComplicationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Complication Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationAdministeredMedicationComplicationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_COMPLICATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredMedicationComplicationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Complication Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationComplicationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_COMPLICATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredMedicationComplicationRelationship(
			MedicationAdministered medicationAdministered, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_COMPLICATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_COMPLICATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_COMPLICATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_COMPLICATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_MEDICATION_COMPLICATION_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredMedicationComplicationRelationship"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredMedicationPriorAdministrationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Prior Administration Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationPriorAdministrationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PRIOR_ADMINISTRATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredMedicationPriorAdministrationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Prior Administration Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationPriorAdministrationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PRIOR_ADMINISTRATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredMedicationPriorAdministrationRelationship(
			MedicationAdministered medicationAdministered, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PRIOR_ADMINISTRATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PRIOR_ADMINISTRATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PRIOR_ADMINISTRATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PRIOR_ADMINISTRATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_MEDICATION_PRIOR_ADMINISTRATION_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredMedicationPriorAdministrationRelationship"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredMedicationPerformerParticipation(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Performer Participation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationPerformerParticipation(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PERFORMER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredMedicationPerformerParticipation(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Performer Participation</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationPerformerParticipation(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PERFORMER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredMedicationPerformerParticipation(
			MedicationAdministered medicationAdministered, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PERFORMER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PERFORMER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PERFORMER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PERFORMER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_MEDICATION_PERFORMER_PARTICIPATION,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredMedicationPerformerParticipation"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredMedicationAuthorizationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Authorization Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationAuthorizationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_AUTHORIZATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredMedicationAuthorizationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Authorization Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationAuthorizationRelationship(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_AUTHORIZATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredMedicationAuthorizationRelationship(
			MedicationAdministered medicationAdministered, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_AUTHORIZATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_AUTHORIZATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_AUTHORIZATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_AUTHORIZATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_MEDICATION_AUTHORIZATION_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredMedicationAuthorizationRelationship"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredMedicationAdministrationDeviceParticipant(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Administration Device Participant</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationAdministrationDeviceParticipant(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_ADMINISTRATION_DEVICE_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredMedicationAdministrationDeviceParticipant(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Administration Device Participant</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredMedicationAdministrationDeviceParticipant(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_ADMINISTRATION_DEVICE_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredMedicationAdministrationDeviceParticipant(
			MedicationAdministered medicationAdministered, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_ADMINISTRATION_DEVICE_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_ADMINISTRATION_DEVICE_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_ADMINISTRATION_DEVICE_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_ADMINISTRATION_DEVICE_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_MEDICATION_ADMINISTRATION_DEVICE_PARTICIPANT,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredMedicationAdministrationDeviceParticipant"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredClassCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredClassCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredClassCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredClassCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredClassCode(MedicationAdministered medicationAdministered,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ADMINISTERED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_CLASS_CODE,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredClassCode"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredDoseQuantity(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Dose Quantity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredDoseQuantity(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredDoseQuantity(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Dose Quantity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredDoseQuantity(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredDoseQuantity(MedicationAdministered medicationAdministered,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ADMINISTERED_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_DOSE_QUANTITY,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredDoseQuantity"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredEffectiveTime(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredEffectiveTime(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredEffectiveTime(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredEffectiveTime(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredEffectiveTime(MedicationAdministered medicationAdministered,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ADMINISTERED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredEffectiveTime"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredNegationInd(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Negation Ind</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredNegationInd(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredNegationInd(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Negation Ind</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredNegationInd(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredNegationInd(MedicationAdministered medicationAdministered,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ADMINISTERED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_NEGATION_IND,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredNegationInd"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredRouteCodeP(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Route Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredRouteCodeP(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredRouteCodeP(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Route Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredRouteCodeP(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredRouteCodeP(MedicationAdministered medicationAdministered,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_ROUTE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredRouteCodeP"),
					new Object[] { medicationAdministered }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministeredRouteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministeredRouteCodeP", passToken);
				}
				passToken.add(medicationAdministered);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredRouteCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Route Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredRouteCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.3.26.1.1.1' and (value.code = 'C38208' or value.code = 'C38246' or value.code = 'C38216' or value.code = 'C38222' or value.code = 'C38284' or value.code = 'C28161' or value.code = 'C38255' or value.code = 'C38253' or value.code = 'C38276' or value.code = 'C38285' or value.code = 'C38287' or value.code = 'C38288' or value.code = 'C38290' or value.code = 'C38192' or value.code = 'C38295' or value.code = 'C38299' or value.code = 'C38300' or value.code = 'C38304' or value.code = 'C38308' or value.code = 'C38305' or value.code = 'C38271' or value.code = 'NewCode' or value.code = 'C38250'))";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredRouteCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Route Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredRouteCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredRouteCode(MedicationAdministered medicationAdministered,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministeredRouteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationAdministered)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_ROUTE_CODE,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredRouteCode"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredApproachSiteCodeP(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Approach Site Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredApproachSiteCodeP(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredApproachSiteCodeP(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Approach Site Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredApproachSiteCodeP(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredApproachSiteCodeP(
			MedicationAdministered medicationAdministered, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_APPROACH_SITE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredApproachSiteCodeP"),
					new Object[] { medicationAdministered }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministeredApproachSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministeredApproachSiteCodeP", passToken);
				}
				passToken.add(medicationAdministered);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationAdministeredApproachSiteCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Approach Site Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredApproachSiteCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.code = '15562006' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationAdministeredApproachSiteCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Approach Site Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationAdministeredApproachSiteCode(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationAdministeredApproachSiteCode(MedicationAdministered medicationAdministered,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministeredApproachSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationAdministered)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ADMINISTERED_APPROACH_SITE_CODE,
					EmspcrPlugin.INSTANCE.getString("MedicationAdministeredApproachSiteCode"),
					new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationActivityTemplateId(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationActivityTemplateId(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.72')";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationActivityTemplateId(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationActivityTemplateId(MedicationAdministered, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicationAdministered The receiving '<em><b>Medication Administered</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationActivityTemplateId(MedicationAdministered medicationAdministered,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_ADMINISTERED);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationAdministered)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_ADMINISTERED__MEDICATION_ACTIVITY_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MedicationActivityTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									medicationAdministered, context) }), new Object[] { medicationAdministered }));
			}

			return false;
		}
		return true;
	}

} // MedicationAdministeredOperations
