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
import org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SupplyOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Medicinal Supply Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasParticipantLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Participant Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasIntentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Intent Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasAssignedAuthorID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author Person Or Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformerTimeEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Time Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformerTimeIntent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Time Intent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformerAssignedEntityID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Assigned Entity ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Entity Person Or Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantityHasValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Has Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityOrderNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Order Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityOrderExpiration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Order Expiration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantityOrdered(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Ordered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityPrescriptionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Prescription Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityAssigningAuthority(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Assigning Authority</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityDispenseDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Dispense Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityDispensingPharmacyLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Dispensing Pharmacy Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantityDispensed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Dispensed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasFillNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Fill Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityMedicationFullfillmentInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Medication Fullfillment Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#getMedicationStatusObservation() <em>Get Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#getProductInstances() <em>Get Product Instances</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#getMedicationFullfillmentInstructions() <em>Get Medication Fullfillment Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonMedicinalSupplyActivityOperations extends SupplyOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonMedicinalSupplyActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityMoodCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityMoodCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT ";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityMoodCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityMoodCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT 
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityMoodCode(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityMoodCode"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.author->isEmpty()
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasAuthor(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasAuthor"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasPerformer(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformer(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.performer->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasPerformer(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformer(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.performer->isEmpty()
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasPerformer(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasPerformer"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasParticipantLocation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Participant Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasParticipantLocation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::LOC)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasParticipantLocation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Participant Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasParticipantLocation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::LOC)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasParticipantLocation(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasParticipantLocation"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityInformationSource(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityInformationSource(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "
			+ "or not self.getSection().informant->isEmpty()"
			+ "or not self.getClinicalDocument().informant->isEmpty()"
			+ "or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"
			+ "or (self.entryRelationship->exists(rel : cda::EntryRelationship | "
			+ "   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"
			+ "   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityInformationSource(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityInformationSource(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 * or not self.getSection().informant->isEmpty()
	 * or not self.getClinicalDocument().informant->isEmpty()
	 * or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 * or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityInformationSource(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_INFORMATION_SOURCE,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityInformationSource"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasProduct(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasProduct(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.product.oclIsUndefined() and self.product.oclIsKindOf(cda::Product)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasProduct(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasProduct(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.product.oclIsUndefined() and self.product.oclIsKindOf(cda::Product)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasProduct(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PRODUCT,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasProduct"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasIntentAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Intent Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasIntentAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.classCode=vocab::ActClassSupply::SPLY and self.moodCode=vocab::x_DocumentSubstanceMood::INT) implies self.author->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasIntentAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Intent Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasIntentAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.classCode=vocab::ActClassSupply::SPLY and self.moodCode=vocab::x_DocumentSubstanceMood::INT) implies self.author->size() > 0
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasIntentAuthor(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_INTENT_AUTHOR,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasIntentAuthor"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasAuthorTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasAuthorTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty() implies self.author->forAll(author| author.time->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasAuthorTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasAuthorTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.author->isEmpty() implies self.author->forAll(author| author.time->size() = 1)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasAuthorTime(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR_TIME,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasAuthorTime"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasAssignedAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasAssignedAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty() implies  self.author->forAll(author| author.assignedAuthor->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasAssignedAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasAssignedAuthor(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.author->isEmpty() implies  self.author->forAll(author| author.assignedAuthor->size() = 1)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasAssignedAuthor(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasAssignedAuthor"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasAssignedAuthorID(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasAssignedAuthorID(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author.assignedAuthor->isEmpty() implies self.author.assignedAuthor->forAll ( assignedAuthor | assignedAuthor.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasAssignedAuthorID(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasAssignedAuthorID(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.author.assignedAuthor->isEmpty() implies self.author.assignedAuthor->forAll ( assignedAuthor | assignedAuthor.id->size() > 0)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasAssignedAuthorID(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_ID,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasAssignedAuthorID"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author Person Or Org</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author.assignedAuthor->isEmpty() implies    (self.author.assignedAuthor.assignedPerson->size() > 0 and self.author.assignedAuthor.assignedPerson.name->size() > 0) or (self.author.assignedAuthor.representedOrganization->size() > 0 and self.author.assignedAuthor.representedOrganization.name->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author Person Or Org</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.author.assignedAuthor->isEmpty() implies    (self.author.assignedAuthor.assignedPerson->size() > 0 and self.author.assignedAuthor.assignedPerson.name->size() > 0) or (self.author.assignedAuthor.representedOrganization->size() > 0 and self.author.assignedAuthor.representedOrganization.name->size() > 0)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasPerformerTimeEvent(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Time Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformerTimeEvent(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.performer->isEmpty()) and self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies self.performer->forAll(time->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasPerformerTimeEvent(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Time Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformerTimeEvent(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.performer->isEmpty()) and self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies self.performer->forAll(time->size() = 1)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasPerformerTimeEvent(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_EVENT,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasPerformerTimeEvent"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasPerformerTimeIntent(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Time Intent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformerTimeIntent(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.performer->isEmpty()) and self.moodCode = vocab::x_DocumentSubstanceMood::INT implies self.performer->forAll(time->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasPerformerTimeIntent(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Time Intent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformerTimeIntent(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.performer->isEmpty()) and self.moodCode = vocab::x_DocumentSubstanceMood::INT implies self.performer->forAll(time->size() = 1)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasPerformerTimeIntent(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_INTENT,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasPerformerTimeIntent"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasPerformerAssignedEntity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformerAssignedEntity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.performer->isEmpty()) implies self.performer->forAll(performer| not performer.assignedEntity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasPerformerAssignedEntity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformerAssignedEntity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.performer->isEmpty()) implies self.performer->forAll(performer| not performer.assignedEntity.oclIsUndefined())
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasPerformerAssignedEntity(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasPerformerAssignedEntity"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasPerformerAssignedEntityID(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Assigned Entity ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformerAssignedEntityID(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.performer.assignedEntity->isEmpty())  implies self.performer.assignedEntity->forAll(id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasPerformerAssignedEntityID(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Assigned Entity ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformerAssignedEntityID(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.performer.assignedEntity->isEmpty())  implies self.performer.assignedEntity->forAll(id->size() > 0)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasPerformerAssignedEntityID(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY_ID,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasPerformerAssignedEntityID"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Entity Person Or Org</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.performer.assignedEntity->isEmpty()) implies self.performer.assignedEntity->forAll(assignedEntity | (not assignedEntity.assignedPerson->isEmpty() and assignedEntity.assignedPerson->forAll( assignedPerson | not assignedPerson.name->isEmpty() ) ) or (not assignedEntity.representedOrganization->isEmpty() and  assignedEntity.representedOrganization->forAll(representedOrganization | not representedOrganization.name->isEmpty() ) )  )";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Entity Person Or Org</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.performer.assignedEntity->isEmpty()) implies self.performer.assignedEntity->forAll(assignedEntity | (not assignedEntity.assignedPerson->isEmpty() and assignedEntity.assignedPerson->forAll( assignedPerson | not assignedPerson.name->isEmpty() ) ) or (not assignedEntity.representedOrganization->isEmpty() and  assignedEntity.representedOrganization->forAll(representedOrganization | not representedOrganization.name->isEmpty() ) )  )
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityQuantityHasValue(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Has Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityQuantityHasValue(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.quantity->isEmpty() implies self.quantity.isDefined('value')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityQuantityHasValue(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Has Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityQuantityHasValue(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.quantity->isEmpty() implies self.quantity.isDefined('value')
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityQuantityHasValue(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_HAS_VALUE,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityQuantityHasValue"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityOrderNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Order Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityOrderNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::INT implies self.id->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityOrderNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Order Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityOrderNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentSubstanceMood::INT implies self.id->size() > 0
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityOrderNumber(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_NUMBER,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityOrderNumber"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityOrderExpiration(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Order Expiration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityOrderExpiration(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode =  vocab::x_DocumentSubstanceMood::INT implies not self.effectiveTime->select(et | et.value.oclIsUndefined())->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityOrderExpiration(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Order Expiration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityOrderExpiration(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode =  vocab::x_DocumentSubstanceMood::INT implies not self.effectiveTime->select(et | et.value.oclIsUndefined())->isEmpty()
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityOrderExpiration(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_EXPIRATION,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityOrderExpiration"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityQuantityOrdered(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Ordered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityQuantityOrdered(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.quantity.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityQuantityOrdered(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Ordered</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityQuantityOrdered(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.quantity.value.oclIsUndefined()
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityQuantityOrdered(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_ORDERED,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityQuantityOrdered"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityQuantityUnit(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityQuantityUnit(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.quantity.unit.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityQuantityUnit(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Unit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityQuantityUnit(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.quantity.unit.oclIsUndefined()
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityQuantityUnit(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_UNIT,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityQuantityUnit"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityPrescriptionNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Prescription Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityPrescriptionNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityPrescriptionNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Prescription Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityPrescriptionNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies not self.id->isEmpty()
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityPrescriptionNumber(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_PRESCRIPTION_NUMBER,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityPrescriptionNumber"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityAssigningAuthority(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Assigning Authority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityAssigningAuthority(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id.root->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityAssigningAuthority(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Assigning Authority</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityAssigningAuthority(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id.root->size() > 0
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityAssigningAuthority(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_ASSIGNING_AUTHORITY,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityAssigningAuthority"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityDispenseDate(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Dispense Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityDispenseDate(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies self.effectiveTime->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityDispenseDate(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Dispense Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityDispenseDate(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies self.effectiveTime->size() > 0
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityDispenseDate(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSE_DATE,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityDispenseDate"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityDispensingPharmacyLocation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Dispensing Pharmacy Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityDispensingPharmacyLocation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode =  vocab::x_DocumentSubstanceMood::EVN  implies self.performer->select(p | p.assignedEntity.addr->isEmpty())->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityDispensingPharmacyLocation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Dispensing Pharmacy Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityDispensingPharmacyLocation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode =  vocab::x_DocumentSubstanceMood::EVN  implies self.performer->select(p | p.assignedEntity.addr->isEmpty())->isEmpty()
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityDispensingPharmacyLocation(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSING_PHARMACY_LOCATION,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityDispensingPharmacyLocation"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityQuantityDispensed(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Dispensed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityQuantityDispensed(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies not self.quantity.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityQuantityDispensed(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Dispensed</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityQuantityDispensed(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies not self.quantity.value.oclIsUndefined()
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityQuantityDispensed(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_DISPENSED,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityQuantityDispensed"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityHasFillNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Fill Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasFillNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er | er.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP and er.sequenceNumber.oclIsUndefined())->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityHasFillNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Fill Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityHasFillNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er | er.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP and er.sequenceNumber.oclIsUndefined())->isEmpty()
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityHasFillNumber(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_FILL_NUMBER,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityHasFillNumber"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8.3')
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityTemplateId(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityTemplateId"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityId(NonMedicinalSupplyActivity nonMedicinalSupplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_ID,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityId"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityStatusCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityStatusCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityStatusCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityStatusCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityStatusCode(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityStatusCode"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityEffectiveTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityEffectiveTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityEffectiveTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityEffectiveTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityEffectiveTime(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityEffectiveTime"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityRepeatNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityRepeatNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityRepeatNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityRepeatNumber(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityRepeatNumber(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_REPEAT_NUMBER,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityRepeatNumber"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityQuantity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityQuantity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityQuantity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityQuantity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityQuantity(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityQuantity"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityMedicationStatusObservation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityMedicationStatusObservation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityMedicationStatusObservation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Medication Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityMedicationStatusObservation(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityMedicationStatusObservation(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityMedicationStatusObservation"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityProductInstance(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityProductInstance(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityProductInstance(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityProductInstance(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityProductInstance(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityProductInstance"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityMedicationFullfillmentInstructions(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Medication Fullfillment Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityMedicationFullfillmentInstructions(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::MedicationFullfillmentInstructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityMedicationFullfillmentInstructions(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Medication Fullfillment Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityMedicationFullfillmentInstructions(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::MedicationFullfillmentInstructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonMedicinalSupplyActivityMedicationFullfillmentInstructions(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_MEDICATION_FULLFILLMENT_INSTRUCTIONS,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityMedicationFullfillmentInstructions"),
					new Object[] { nonMedicinalSupplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationStatusObservation(NonMedicinalSupplyActivity) <em>Get Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(NonMedicinalSupplyActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationStatusObservation(NonMedicinalSupplyActivity) <em>Get Medication Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(NonMedicinalSupplyActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationStatusObservation getMedicationStatusObservation(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity) {
		if (GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY,
				ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY.getEAllOperations().get(86));
			try {
				GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY);
		return (MedicationStatusObservation) query.evaluate(nonMedicinalSupplyActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProductInstances(NonMedicinalSupplyActivity) <em>Get Product Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances(NonMedicinalSupplyActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRODUCT_INSTANCES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)";

	/**
	 * The cached OCL query for the '{@link #getProductInstances(NonMedicinalSupplyActivity) <em>Get Product Instances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances(NonMedicinalSupplyActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRODUCT_INSTANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProductInstance> getProductInstances(NonMedicinalSupplyActivity nonMedicinalSupplyActivity) {
		if (GET_PRODUCT_INSTANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY,
				ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY.getEAllOperations().get(87));
			try {
				GET_PRODUCT_INSTANCES__EOCL_QRY = helper.createQuery(GET_PRODUCT_INSTANCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRODUCT_INSTANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProductInstance> result = (Collection<ProductInstance>) query.evaluate(nonMedicinalSupplyActivity);
		return new BasicEList.UnmodifiableEList<ProductInstance>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationFullfillmentInstructions(NonMedicinalSupplyActivity) <em>Get Medication Fullfillment Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationFullfillmentInstructions(NonMedicinalSupplyActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::MedicationFullfillmentInstructions))->asSequence()->first().oclAsType(consol::MedicationFullfillmentInstructions)";

	/**
	 * The cached OCL query for the '{@link #getMedicationFullfillmentInstructions(NonMedicinalSupplyActivity) <em>Get Medication Fullfillment Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationFullfillmentInstructions(NonMedicinalSupplyActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::MedicationFullfillmentInstructions))->asSequence()->first().oclAsType(consol::MedicationFullfillmentInstructions)
	 * @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationFullfillmentInstructions getMedicationFullfillmentInstructions(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity) {
		if (GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY,
				ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY.getEAllOperations().get(88));
			try {
				GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY);
		return (MedicationFullfillmentInstructions) query.evaluate(nonMedicinalSupplyActivity);
	}

} // NonMedicinalSupplyActivityOperations
