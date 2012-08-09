/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.CreateTransmitSummaryOfCareRecordOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Create Transmit Summary Of Care Record</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class CreateTransmitSummaryOfCareRecordImpl extends
		GeneralHeaderConstraintsImpl implements
		CreateTransmitSummaryOfCareRecord {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CreateTransmitSummaryOfCareRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CreateTransmitSummaryOfCareRecordOperations
				.validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CreateTransmitSummaryOfCareRecordOperations
				.validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CreateTransmitSummaryOfCareRecordOperations
				.validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CreateTransmitSummaryOfCareRecordOperations
				.validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CreateTransmitSummaryOfCareRecordOperations
				.validateGeneralHeaderConstraintsTemplateId(this, diagnostics,
						context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public CreateTransmitSummaryOfCareRecord init() {
		CDAUtil.init(this);
		return this;
	}
} // CreateTransmitSummaryOfCareRecordImpl
