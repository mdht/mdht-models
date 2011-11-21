/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationOrderInformationOperations;

import org.openhealthtools.mdht.uml.cda.impl.SupplyImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Order Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationOrderInformationImpl extends SupplyImpl implements MedicationOrderInformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationOrderInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_ORDER_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasParticipantLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasParticipantLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasIntentAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasIntentAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasAssignedAuthorID(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasAssignedAuthorID(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasAssignedAuthorPersonOrOrg(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasAssignedAuthorPersonOrOrg(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasPerformerTimeEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasPerformerTimeEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasPerformerTimeIntent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasPerformerTimeIntent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasPerformerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasPerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasPerformerAssignedEntityID(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasPerformerAssignedEntityID(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasPerformerEntityPersonOrOrg(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasPerformerEntityPersonOrOrg(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationQuantityHasValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationQuantityHasValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationOrderNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationOrderNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationOrderExpiration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationOrderExpiration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationQuantityOrdered(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationQuantityOrdered(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationQuantityUnit(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationQuantityUnit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationPrescriptionNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationPrescriptionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationAssigningAuthority(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationAssigningAuthority(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationDispenseDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationDispenseDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationDispensingPharmacyLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationDispensingPharmacyLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationQuantityDispensed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationQuantityDispensed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasFillNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasFillNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationMedicationStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationMedicationStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationProductInstance(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationProductInstance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationMedicationFullfillmentInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationMedicationFullfillmentInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation getMedicationStatusObservation() {
		return MedicationOrderInformationOperations.getMedicationStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductInstance> getProductInstances() {
		return MedicationOrderInformationOperations.getProductInstances(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationFullfillmentInstructions getMedicationFullfillmentInstructions() {
		return MedicationOrderInformationOperations.getMedicationFullfillmentInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderInformation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //MedicationOrderInformationImpl
