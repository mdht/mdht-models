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
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SupplyOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Order Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasParticipantLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Participant Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasIntentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Intent Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasAssignedAuthorID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Assigned Author ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasAssignedAuthorPersonOrOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Assigned Author Person Or Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasPerformerTimeEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Time Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasPerformerTimeIntent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Time Intent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasPerformerAssignedEntityID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Assigned Entity ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasPerformerEntityPersonOrOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Entity Person Or Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationOrderNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationOrderExpiration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Expiration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationQuantityOrdered(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Ordered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationPrescriptionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Prescription Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationAssigningAuthority(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Assigning Authority</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationDispenseDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispense Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationDispensingPharmacyLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispensing Pharmacy Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationQuantityDispensed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Dispensed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationHasFillNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Fill Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#validateMedicationOrderInformationProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#getMedicationStatusObservation() <em>Get Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#getProductInstances() <em>Get Product Instances</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation#getMedicationFullfillmentInstructions() <em>Get Medication Fullfillment Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationOrderInformationOperations extends SupplyOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationOrderInformationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationMoodCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationMoodCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT ";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationMoodCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationMoodCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT 
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationMoodCode(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationMoodCode"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.author->isEmpty()
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasAuthor(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_AUTHOR,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasAuthor"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasPerformer(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformer(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.performer->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasPerformer(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformer(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.performer->isEmpty()
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasPerformer(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_PERFORMER,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasPerformer"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasParticipantLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Participant Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasParticipantLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::LOC)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasParticipantLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Participant Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasParticipantLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::LOC)
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasParticipantLocation(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_PARTICIPANT_LOCATION,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasParticipantLocation"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationInformationSource(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationInformationSource(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "
			+ "or not self.getSection().informant->isEmpty()"
			+ "or not self.getClinicalDocument().informant->isEmpty()"
			+ "or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"
			+ "or (self.entryRelationship->exists(rel : cda::EntryRelationship | "
			+ "   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"
			+ "   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationInformationSource(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationInformationSource(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationInformationSource(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_INFORMATION_SOURCE,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationInformationSource"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasProduct(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasProduct(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.product.oclIsUndefined() and self.product.oclIsKindOf(cda::Product)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasProduct(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasProduct(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.product.oclIsUndefined() and self.product.oclIsKindOf(cda::Product)
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasProduct(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_PRODUCT,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasProduct"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasIntentAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Intent Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasIntentAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.classCode=vocab::ActClassSupply::SPLY and self.moodCode=vocab::x_DocumentSubstanceMood::INT) implies self.author->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasIntentAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Intent Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasIntentAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.classCode=vocab::ActClassSupply::SPLY and self.moodCode=vocab::x_DocumentSubstanceMood::INT) implies self.author->size() > 0
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasIntentAuthor(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_INTENT_AUTHOR,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasIntentAuthor"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasAuthorTime(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasAuthorTime(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author.time->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasAuthorTime(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasAuthorTime(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author.time->size() = 1
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasAuthorTime(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_AUTHOR_TIME,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasAuthorTime"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasAssignedAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasAssignedAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author.assignedAuthor->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasAssignedAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasAssignedAuthor(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author.assignedAuthor->size() = 1
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasAssignedAuthor(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasAssignedAuthor"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasAssignedAuthorID(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Assigned Author ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasAssignedAuthorID(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author.assignedAuthor.id->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasAssignedAuthorID(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Assigned Author ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasAssignedAuthorID(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author.assignedAuthor.id->size() > 0
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasAssignedAuthorID(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_ID,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasAssignedAuthorID"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasAssignedAuthorPersonOrOrg(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Assigned Author Person Or Org</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasAssignedAuthorPersonOrOrg(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.author.assignedAuthor.assignedPerson->size() > 0 and self.author.assignedAuthor.assignedPerson.name->size() > 0) or (self.author.assignedAuthor.representedOrganization->size() > 0 and self.author.assignedAuthor.representedOrganization.name->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasAssignedAuthorPersonOrOrg(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Assigned Author Person Or Org</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasAssignedAuthorPersonOrOrg(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.author.assignedAuthor.assignedPerson->size() > 0 and self.author.assignedAuthor.assignedPerson.name->size() > 0) or (self.author.assignedAuthor.representedOrganization->size() > 0 and self.author.assignedAuthor.representedOrganization.name->size() > 0)
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasAssignedAuthorPersonOrOrg(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasAssignedAuthorPersonOrOrg"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasPerformerTimeEvent(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Time Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformerTimeEvent(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::EVN and self.performer.time->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasPerformerTimeEvent(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Time Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformerTimeEvent(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentSubstanceMood::EVN and self.performer.time->size() = 1
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasPerformerTimeEvent(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_EVENT,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasPerformerTimeEvent"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasPerformerTimeIntent(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Time Intent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformerTimeIntent(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::INT and self.performer.time->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasPerformerTimeIntent(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Time Intent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformerTimeIntent(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentSubstanceMood::INT and self.performer.time->size() = 1
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasPerformerTimeIntent(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_TIME_INTENT,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasPerformerTimeIntent"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasPerformerAssignedEntity(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformerAssignedEntity(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer.assignedEntity->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasPerformerAssignedEntity(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformerAssignedEntity(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer.assignedEntity->size() = 1
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasPerformerAssignedEntity(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasPerformerAssignedEntity"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasPerformerAssignedEntityID(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Assigned Entity ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformerAssignedEntityID(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer.assignedEntity.id->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasPerformerAssignedEntityID(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Assigned Entity ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformerAssignedEntityID(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer.assignedEntity.id->size() > 0
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasPerformerAssignedEntityID(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ASSIGNED_ENTITY_ID,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasPerformerAssignedEntityID"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasPerformerEntityPersonOrOrg(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Entity Person Or Org</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformerEntityPersonOrOrg(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.performer.assignedEntity.assignedPerson->size() > 0 and self.performer.assignedEntity.assignedPerson.name->size() > 0 ) or (self.performer.assignedEntity.representedOrganization->size() > 0 and self.performer.assignedEntity.representedOrganization.name->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasPerformerEntityPersonOrOrg(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Performer Entity Person Or Org</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasPerformerEntityPersonOrOrg(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.performer.assignedEntity.assignedPerson->size() > 0 and self.performer.assignedEntity.assignedPerson.name->size() > 0 ) or (self.performer.assignedEntity.representedOrganization->size() > 0 and self.performer.assignedEntity.representedOrganization.name->size() > 0)
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasPerformerEntityPersonOrOrg(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_PERFORMER_ENTITY_PERSON_OR_ORG,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasPerformerEntityPersonOrOrg"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationOrderNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationOrderNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::INT implies self.id->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationOrderNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationOrderNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentSubstanceMood::INT implies self.id->size() > 0
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationOrderNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_ORDER_NUMBER,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationOrderNumber"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationOrderExpiration(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Expiration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationOrderExpiration(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode =  vocab::x_DocumentSubstanceMood::INT implies not self.effectiveTime->select(et | et.value.oclIsUndefined())->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationOrderExpiration(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Expiration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationOrderExpiration(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode =  vocab::x_DocumentSubstanceMood::INT implies not self.effectiveTime->select(et | et.value.oclIsUndefined())->isEmpty()
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationOrderExpiration(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationOrderExpiration"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationQuantityOrdered(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Ordered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationQuantityOrdered(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.quantity.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationQuantityOrdered(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Ordered</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationQuantityOrdered(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.quantity.value.oclIsUndefined()
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationQuantityOrdered(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationQuantityOrdered"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationQuantityUnit(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationQuantityUnit(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.quantity.unit.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationQuantityUnit(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Unit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationQuantityUnit(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.quantity.unit.oclIsUndefined()
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationQuantityUnit(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationQuantityUnit"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationPrescriptionNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Prescription Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationPrescriptionNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationPrescriptionNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Prescription Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationPrescriptionNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies not self.id->isEmpty()
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationPrescriptionNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationPrescriptionNumber"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationAssigningAuthority(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Assigning Authority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationAssigningAuthority(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id.root->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationAssigningAuthority(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Assigning Authority</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationAssigningAuthority(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id.root->size() > 0
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationAssigningAuthority(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationAssigningAuthority"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationDispenseDate(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispense Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationDispenseDate(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies self.effectiveTime->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationDispenseDate(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispense Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationDispenseDate(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies self.effectiveTime->size() > 0
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationDispenseDate(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_DISPENSE_DATE,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationDispenseDate"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationDispensingPharmacyLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispensing Pharmacy Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationDispensingPharmacyLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode =  vocab::x_DocumentSubstanceMood::EVN  implies self.performer->select(p | p.assignedEntity.addr->isEmpty())->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationDispensingPharmacyLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispensing Pharmacy Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationDispensingPharmacyLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode =  vocab::x_DocumentSubstanceMood::EVN  implies self.performer->select(p | p.assignedEntity.addr->isEmpty())->isEmpty()
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationDispensingPharmacyLocation(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationDispensingPharmacyLocation"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationQuantityDispensed(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Dispensed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationQuantityDispensed(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies not self.quantity.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationQuantityDispensed(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Dispensed</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationQuantityDispensed(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies not self.quantity.value.oclIsUndefined()
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationQuantityDispensed(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationQuantityDispensed"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasFillNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Fill Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasFillNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er | er.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP and er.sequenceNumber.oclIsUndefined())->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasFillNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Fill Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationHasFillNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er | er.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP and er.sequenceNumber.oclIsUndefined())->isEmpty()
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationHasFillNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationHasFillNumber"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationTemplateId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationTemplateId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationTemplateId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationTemplateId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8.3')
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationTemplateId(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationTemplateId"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationId(MedicationOrderInformation medicationOrderInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_ID,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationId"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationStatusCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationStatusCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationStatusCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationStatusCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationStatusCode(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationStatusCode"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationEffectiveTime(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationEffectiveTime(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationEffectiveTime(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationEffectiveTime(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationEffectiveTime(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationEffectiveTime"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationRepeatNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationRepeatNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationRepeatNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationRepeatNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationRepeatNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationRepeatNumber"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationQuantity(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationQuantity(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationQuantity(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationQuantity(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationQuantity(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationQuantity"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationMedicationStatusObservation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationMedicationStatusObservation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationMedicationStatusObservation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Medication Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationMedicationStatusObservation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationMedicationStatusObservation(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_MEDICATION_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationMedicationStatusObservation"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationOrderInformationProductInstance(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Product Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationProductInstance(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationOrderInformationProductInstance(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Product Instance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationOrderInformationProductInstance(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationOrderInformationProductInstance(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ORDER_INFORMATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION);
			try {
				VALIDATE_MEDICATION_ORDER_INFORMATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ORDER_INFORMATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationOrderInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_PRODUCT_INSTANCE,
					ConsolPlugin.INSTANCE.getString("MedicationOrderInformationProductInstance"),
					new Object[] { medicationOrderInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationStatusObservation(MedicationOrderInformation) <em>Get Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(MedicationOrderInformation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationStatusObservation(MedicationOrderInformation) <em>Get Medication Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(MedicationOrderInformation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationStatusObservation getMedicationStatusObservation(
			MedicationOrderInformation medicationOrderInformation) {
		if (GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION,
				ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION.getEAllOperations().get(84));
			try {
				GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY);
		return (MedicationStatusObservation) query.evaluate(medicationOrderInformation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProductInstances(MedicationOrderInformation) <em>Get Product Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances(MedicationOrderInformation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRODUCT_INSTANCES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)";

	/**
	 * The cached OCL query for the '{@link #getProductInstances(MedicationOrderInformation) <em>Get Product Instances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances(MedicationOrderInformation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRODUCT_INSTANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProductInstance> getProductInstances(MedicationOrderInformation medicationOrderInformation) {
		if (GET_PRODUCT_INSTANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION,
				ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION.getEAllOperations().get(85));
			try {
				GET_PRODUCT_INSTANCES__EOCL_QRY = helper.createQuery(GET_PRODUCT_INSTANCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRODUCT_INSTANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProductInstance> result = (Collection<ProductInstance>) query.evaluate(medicationOrderInformation);
		return new BasicEList.UnmodifiableEList<ProductInstance>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationFullfillmentInstructions(MedicationOrderInformation) <em>Get Medication Fullfillment Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationFullfillmentInstructions(MedicationOrderInformation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::MedicationFullfillmentInstructions))->asSequence()->first().oclAsType(consol::MedicationFullfillmentInstructions)";

	/**
	 * The cached OCL query for the '{@link #getMedicationFullfillmentInstructions(MedicationOrderInformation) <em>Get Medication Fullfillment Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationFullfillmentInstructions(MedicationOrderInformation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::MedicationFullfillmentInstructions))->asSequence()->first().oclAsType(consol::MedicationFullfillmentInstructions)
	 * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationFullfillmentInstructions getMedicationFullfillmentInstructions(
			MedicationOrderInformation medicationOrderInformation) {
		if (GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION,
				ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION.getEAllOperations().get(86));
			try {
				GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_FULLFILLMENT_INSTRUCTIONS__EOCL_QRY);
		return (MedicationFullfillmentInstructions) query.evaluate(medicationOrderInformation);
	}

} // MedicationOrderInformationOperations
