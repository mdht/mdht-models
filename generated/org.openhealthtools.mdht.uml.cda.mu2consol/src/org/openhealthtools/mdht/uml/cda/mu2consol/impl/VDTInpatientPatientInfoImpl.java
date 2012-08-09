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

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTInpatientPatientInfoOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>VDT Inpatient Patient Info</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class VDTInpatientPatientInfoImpl extends GeneralHeaderConstraintsImpl
		implements VDTInpatientPatientInfo {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VDTInpatientPatientInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations
				.validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations
				.validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations
				.validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoMedicationListConstraint(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations
				.validateVDTInpatientPatientInfoMedicationListConstraint(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations
				.validateGeneralHeaderConstraintsTemplateId(this, diagnostics,
						context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public VDTInpatientPatientInfo init() {
		CDAUtil.init(this);
		return this;
	}
} // VDTInpatientPatientInfoImpl
