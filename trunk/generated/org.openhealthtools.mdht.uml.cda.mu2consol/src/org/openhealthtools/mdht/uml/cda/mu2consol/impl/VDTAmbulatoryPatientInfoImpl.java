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
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTAmbulatoryPatientInfoOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VDT Ambulatory Patient Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VDTAmbulatoryPatientInfoImpl extends GeneralHeaderConstraintsImpl implements VDTAmbulatoryPatientInfo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VDTAmbulatoryPatientInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.VDT_AMBULATORY_PATIENT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTAmbulatoryPatientInfoMedicationListConstraint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoMedicationListConstraint(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTAmbulatoryPatientInfoOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDTAmbulatoryPatientInfo init() {
    	CDAUtil.init(this);
    	return this;
	}
} //VDTAmbulatoryPatientInfoImpl
