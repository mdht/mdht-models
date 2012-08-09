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

import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ClinicalOfficeVisitSummaryOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Clinical Office Visit Summary</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class ClinicalOfficeVisitSummaryImpl extends
		GeneralHeaderConstraintsImpl implements ClinicalOfficeVisitSummary {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClinicalOfficeVisitSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations
				.validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations
				.validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations
				.validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryMedicationListConstraint(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations
				.validateClinicalOfficeVisitSummaryMedicationListConstraint(
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
		return ClinicalOfficeVisitSummaryOperations
				.validateGeneralHeaderConstraintsTemplateId(this, diagnostics,
						context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ClinicalOfficeVisitSummary init() {
		CDAUtil.init(this);
		return this;
	}
} // ClinicalOfficeVisitSummaryImpl
