/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>VDT Inpatient Summary</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Effective Time</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Location</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Chief Complaint Or Reason For Visit</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Hospital Admission Diagnosis Entry</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryPreoperativeDiagnosisEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Preoperative Diagnosis Entry</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Hospital Discharge Instructions Section
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Hospital Admission Diagnosis Section</em>}
 * </li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Chief Complaint Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Reason For Visit Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Chief Complaint And Reason For Visit
 * Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalDischargeMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Hospital Discharge Medications Section
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryPreoperativeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Preoperative Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalAdmissionMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Hospital Admission Medications Section
 * Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalDischargeInstructionsSection()
 * <em>Get Hospital Discharge Instructions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalAdmissionDiagnosisSection()
 * <em>Get Hospital Admission Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getChiefComplaintSection()
 * <em>Get Chief Complaint Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getReasonForVisitSection()
 * <em>Get Reason For Visit Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getChiefComplaintAndReasonForVisitSection()
 * <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalDischargeMedicationsSection()
 * <em>Get Hospital Discharge Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getPreoperativeDiagnosisSection()
 * <em>Get Preoperative Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalAdmissionMedicationsSectionEntriesOptional()
 * <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class VDTInpatientSummaryOperations extends
		ViewDownloadTransmitSummaryOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VDTInpatientSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryEffectiveTime(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Effective Time</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryEffectiveTime(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or "
			+ "effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryEffectiveTime(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Effective Time</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryEffectiveTime(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_VDT_INPATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .componentOf->excluding(null).encompassingEncounter->excluding(null)->
	 * reject((effectiveTime.oclIsUndefined() or
	 * 
	 * effectiveTime.isNullFlavorUndefined()) implies (not
	 * effectiveTime.oclIsUndefined()))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateVDTInpatientSummaryEffectiveTime(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
		try {
			OCLExpression<EClassifier> oclExpression = helper
					.createQuery(VALIDATE_VDT_INPATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_VDT_INPATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
					.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_VDT_INPATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(vdtInpatientSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_EFFECTIVE_TIME,
									Mu2consolPlugin.INSTANCE
											.getString("VDTInpatientSummaryEffectiveTime"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryLocation(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Location</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryLocation(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->one(location : cda::Location | "
			+ "not location.oclIsUndefined() and location.oclIsKindOf(rim::Participation)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryLocation(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Location</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryLocation(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_VDT_INPATIENT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .componentOf->excluding(null).encompassingEncounter->excluding(null)->
	 * reject(location->one(location : cda::Location |
	 * 
	 * not location.oclIsUndefined() and
	 * location.oclIsKindOf(rim::Participation)))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateVDTInpatientSummaryLocation(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
		try {
			OCLExpression<EClassifier> oclExpression = helper
					.createQuery(VALIDATE_VDT_INPATIENT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_VDT_INPATIENT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
					.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_VDT_INPATIENT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(vdtInpatientSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_LOCATION,
									Mu2consolPlugin.INSTANCE
											.getString("VDTInpatientSummaryLocation"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Chief Complaint Or Reason For Visit</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or "
			+ " self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor "
			+ " self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Chief Complaint Or Reason For Visit</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintSection)) or
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForVisitSection))) xor
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT,
								Mu2consolPlugin.INSTANCE
										.getString("VDTInpatientSummaryChiefComplaintOrReasonForVisit"),
								new Object[] { vdtInpatientSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Hospital Admission Diagnosis Entry</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.retrieveHospitalAdmissionDiagnosisSection()->excluding(null)->reject(retrieveHospitalAdmissionDiagnosisSection().getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::HospitalAdmissionDiagnosis)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Hospital Admission Diagnosis Entry</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .retrieveHospitalAdmissionDiagnosisSection()->excluding(null)->reject(
	 * retrieveHospitalAdmissionDiagnosisSection().getActs()->exists(a :
	 * cda::Act | a.oclIsKindOf(consol::HospitalAdmissionDiagnosis)))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
		try {
			OCLExpression<EClassifier> oclExpression = helper
					.createQuery(VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
					.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(vdtInpatientSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY,
									Mu2consolPlugin.INSTANCE
											.getString("VDTInpatientSummaryHospitalAdmissionDiagnosisEntry"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryPreoperativeDiagnosisEntry(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Preoperative Diagnosis Entry</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryPreoperativeDiagnosisEntry(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.retrievePreoperativeDiagnosisSection()->excluding(null)->reject(retrievePreoperativeDiagnosisSection().getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::PreoperativeDiagnosis)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryPreoperativeDiagnosisEntry(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Preoperative Diagnosis Entry</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryPreoperativeDiagnosisEntry(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.retrievePreoperativeDiagnosisSection()->excluding(null)->reject(
	 * retrievePreoperativeDiagnosisSection().getActs()->exists(a : cda::Act |
	 * a.oclIsKindOf(consol::PreoperativeDiagnosis)))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateVDTInpatientSummaryPreoperativeDiagnosisEntry(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
		try {
			OCLExpression<EClassifier> oclExpression = helper
					.createQuery(VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
					.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(vdtInpatientSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_ENTRY,
									Mu2consolPlugin.INSTANCE
											.getString("VDTInpatientSummaryPreoperativeDiagnosisEntry"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryHospitalDischargeInstructionsSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Hospital Discharge Instructions Section</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryHospitalDischargeInstructionsSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryHospitalDischargeInstructionsSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Hospital Discharge Instructions Section</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryHospitalDischargeInstructionsSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTInpatientSummaryHospitalDischargeInstructionsSection(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("VDTInpatientSummaryHospitalDischargeInstructionsSection"),
								new Object[] { vdtInpatientSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Hospital Admission Diagnosis Section</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Hospital Admission Diagnosis Section</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("VDTInpatientSummaryHospitalAdmissionDiagnosisSection"),
								new Object[] { vdtInpatientSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryChiefComplaintSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Chief Complaint Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryChiefComplaintSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryChiefComplaintSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Chief Complaint Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryChiefComplaintSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintSection))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTInpatientSummaryChiefComplaintSection(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.INFO,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("VDTInpatientSummaryChiefComplaintSection"),
								new Object[] { vdtInpatientSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryReasonForVisitSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Reason For Visit Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryReasonForVisitSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryReasonForVisitSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Reason For Visit Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryReasonForVisitSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForVisitSection))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTInpatientSummaryReasonForVisitSection(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VDT_INPATIENT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_VDT_INPATIENT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.INFO,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_REASON_FOR_VISIT_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("VDTInpatientSummaryReasonForVisitSection"),
								new Object[] { vdtInpatientSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryChiefComplaintAndReasonForVisitSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Chief Complaint And Reason For Visit Section</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryChiefComplaintAndReasonForVisitSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryChiefComplaintAndReasonForVisitSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Chief Complaint And Reason For Visit Section</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryChiefComplaintAndReasonForVisitSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTInpatientSummaryChiefComplaintAndReasonForVisitSection(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.INFO,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("VDTInpatientSummaryChiefComplaintAndReasonForVisitSection"),
								new Object[] { vdtInpatientSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryHospitalDischargeMedicationsSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Hospital Discharge Medications Section</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryHospitalDischargeMedicationsSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryHospitalDischargeMedicationsSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Hospital Discharge Medications Section</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryHospitalDischargeMedicationsSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTInpatientSummaryHospitalDischargeMedicationsSection(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("VDTInpatientSummaryHospitalDischargeMedicationsSection"),
								new Object[] { vdtInpatientSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryPreoperativeDiagnosisSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Preoperative Diagnosis Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryPreoperativeDiagnosisSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryPreoperativeDiagnosisSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Preoperative Diagnosis Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryPreoperativeDiagnosisSection(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::PreoperativeDiagnosisSection))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTInpatientSummaryPreoperativeDiagnosisSection(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.INFO,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("VDTInpatientSummaryPreoperativeDiagnosisSection"),
								new Object[] { vdtInpatientSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTInpatientSummaryHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Hospital Admission Medications Section Entries Optional</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTInpatientSummaryHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Inpatient Summary Hospital Admission Medications Section Entries Optional</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTInpatientSummaryHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(consol::
	 * HospitalAdmissionMedicationsSectionEntriesOptional))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTInpatientSummaryHospitalAdmissionMedicationsSectionEntriesOptional(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.INFO,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL,
								Mu2consolPlugin.INSTANCE
										.getString("VDTInpatientSummaryHospitalAdmissionMedicationsSectionEntriesOptional"),
								new Object[] { vdtInpatientSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getHospitalDischargeInstructionsSection(VDTInpatientSummary)
	 * <em>Get Hospital Discharge Instructions Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHospitalDischargeInstructionsSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getHospitalDischargeInstructionsSection(VDTInpatientSummary)
	 * <em>Get Hospital Discharge Instructions Section</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHospitalDischargeInstructionsSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeInstructionsSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection(
			VDTInpatientSummary vdtInpatientSummary) {
		if (GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY,
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY
							.getEAllOperations().get(329));
			try {
				GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY = helper
						.createQuery(GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY);
		return (HospitalDischargeInstructionsSection) query
				.evaluate(vdtInpatientSummary);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getHospitalAdmissionDiagnosisSection(VDTInpatientSummary)
	 * <em>Get Hospital Admission Diagnosis Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHospitalAdmissionDiagnosisSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection))->asSequence()->any(true).oclAsType(consol::HospitalAdmissionDiagnosisSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getHospitalAdmissionDiagnosisSection(VDTInpatientSummary)
	 * <em>Get Hospital Admission Diagnosis Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHospitalAdmissionDiagnosisSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalAdmissionDiagnosisSection)
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection(
			VDTInpatientSummary vdtInpatientSummary) {
		if (GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY,
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY
							.getEAllOperations().get(330));
			try {
				GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY = helper
						.createQuery(GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY);
		return (HospitalAdmissionDiagnosisSection) query
				.evaluate(vdtInpatientSummary);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getChiefComplaintSection(VDTInpatientSummary)
	 * <em>Get Chief Complaint Section</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChiefComplaintSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getChiefComplaintSection(VDTInpatientSummary)
	 * <em>Get Chief Complaint Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChiefComplaintSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintSection
	 * ))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ChiefComplaintSection getChiefComplaintSection(
			VDTInpatientSummary vdtInpatientSummary) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY,
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY
							.getEAllOperations().get(331));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper
						.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(vdtInpatientSummary);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getReasonForVisitSection(VDTInpatientSummary)
	 * <em>Get Reason For Visit Section</em>}' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getReasonForVisitSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getReasonForVisitSection(VDTInpatientSummary)
	 * <em>Get Reason For Visit Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReasonForVisitSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForVisitSection
	 * ))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ReasonForVisitSection getReasonForVisitSection(
			VDTInpatientSummary vdtInpatientSummary) {
		if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY,
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY
							.getEAllOperations().get(332));
			try {
				GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper
						.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ReasonForVisitSection) query.evaluate(vdtInpatientSummary);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getChiefComplaintAndReasonForVisitSection(VDTInpatientSummary)
	 * <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChiefComplaintAndReasonForVisitSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getChiefComplaintAndReasonForVisitSection(VDTInpatientSummary)
	 * <em>Get Chief Complaint And Reason For Visit Section</em>}' query
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChiefComplaintAndReasonForVisitSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection(
			VDTInpatientSummary vdtInpatientSummary) {
		if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY,
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY
							.getEAllOperations().get(333));
			try {
				GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper
						.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ChiefComplaintAndReasonForVisitSection) query
				.evaluate(vdtInpatientSummary);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getHospitalDischargeMedicationsSection(VDTInpatientSummary)
	 * <em>Get Hospital Discharge Medications Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHospitalDischargeMedicationsSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getHospitalDischargeMedicationsSection(VDTInpatientSummary)
	 * <em>Get Hospital Discharge Medications Section</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHospitalDischargeMedicationsSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeMedicationsSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection)
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection(
			VDTInpatientSummary vdtInpatientSummary) {
		if (GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY,
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY
							.getEAllOperations().get(334));
			try {
				GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY = helper
						.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY);
		return (HospitalDischargeMedicationsSection) query
				.evaluate(vdtInpatientSummary);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getPreoperativeDiagnosisSection(VDTInpatientSummary)
	 * <em>Get Preoperative Diagnosis Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPreoperativeDiagnosisSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(consol::PreoperativeDiagnosisSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getPreoperativeDiagnosisSection(VDTInpatientSummary)
	 * <em>Get Preoperative Diagnosis Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPreoperativeDiagnosisSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::PreoperativeDiagnosisSection
	 * ))->asSequence()->
	 * any(true).oclAsType(consol::PreoperativeDiagnosisSection)
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PreoperativeDiagnosisSection getPreoperativeDiagnosisSection(
			VDTInpatientSummary vdtInpatientSummary) {
		if (GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY,
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY
							.getEAllOperations().get(335));
			try {
				GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY = helper
						.createQuery(GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PreoperativeDiagnosisSection) query
				.evaluate(vdtInpatientSummary);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientSummary)
	 * <em>Get Hospital Admission Medications Section Entries Optional</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::HospitalAdmissionMedicationsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '
	 * {@link #getHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientSummary)
	 * <em>Get Hospital Admission Medications Section Entries Optional</em>}'
	 * query operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(consol::
	 * HospitalAdmissionMedicationsSectionEntriesOptional
	 * ))->asSequence()->any(true
	 * ).oclAsType(consol::HospitalAdmissionMedicationsSectionEntriesOptional)
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional(
			VDTInpatientSummary vdtInpatientSummary) {
		if (GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY,
					Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY
							.getEAllOperations().get(336));
			try {
				GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper
						.createQuery(GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (HospitalAdmissionMedicationsSectionEntriesOptional) query
				.evaluate(vdtInpatientSummary);
	}

} // VDTInpatientSummaryOperations