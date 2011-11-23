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
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;

import org.openhealthtools.mdht.uml.cda.consol.operations.NonMedicinalSupplyActivityOperations;

import org.openhealthtools.mdht.uml.cda.impl.SupplyImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Medicinal Supply Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonMedicinalSupplyActivityImpl extends SupplyImpl implements NonMedicinalSupplyActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonMedicinalSupplyActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasParticipantLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasParticipantLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasIntentAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasIntentAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasAssignedAuthorID(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasAssignedAuthorID(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasPerformerTimeEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformerTimeEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasPerformerTimeIntent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformerTimeIntent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasPerformerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasPerformerAssignedEntityID(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformerAssignedEntityID(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityQuantityHasValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityQuantityHasValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityOrderNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityOrderNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityOrderExpiration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityOrderExpiration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityQuantityOrdered(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityQuantityOrdered(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityQuantityUnit(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityQuantityUnit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityPrescriptionNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityPrescriptionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityAssigningAuthority(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityAssigningAuthority(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityDispenseDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityDispenseDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityDispensingPharmacyLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityDispensingPharmacyLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityQuantityDispensed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityQuantityDispensed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityHasFillNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasFillNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityMedicationStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityMedicationStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityProductInstance(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityProductInstance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityMedicationFullfillmentInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityMedicationFullfillmentInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation getMedicationStatusObservation() {
		return NonMedicinalSupplyActivityOperations.getMedicationStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductInstance> getProductInstances() {
		return NonMedicinalSupplyActivityOperations.getProductInstances(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationFullfillmentInstructions getMedicationFullfillmentInstructions() {
		return NonMedicinalSupplyActivityOperations.getMedicationFullfillmentInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonMedicinalSupplyActivity init() {
    	CDAUtil.init(this);
    	return this;
	}
} //NonMedicinalSupplyActivityImpl
