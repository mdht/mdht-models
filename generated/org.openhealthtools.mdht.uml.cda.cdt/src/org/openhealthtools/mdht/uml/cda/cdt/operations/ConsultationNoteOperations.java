/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteReferralOrVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Referral Or Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNotePhysicalExamination(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Physical Examination</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNotePastMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteAlertsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteDiagnosticFindings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Diagnostic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getPhysicalExamination() <em>Get Physical Examination</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getPastMedicalHistorySection() <em>Get Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getAlertsSection() <em>Get Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getDiagnosticFindings() <em>Get Diagnostic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsultationNoteOperations extends GeneralHeaderConstraintsOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsultationNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteReferralOrVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Referral Or Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReferralOrVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForReferralSection))" +
			"   xor self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitSectionConsult))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteReferralOrVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Referral Or Visit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReferralOrVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteReferralOrVisit(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_REFERRAL_OR_VISIT,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteReferralOrVisit"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Code</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateConsultationNoteCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateConsultationNoteCode(ConsultationNote consultationNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_CODE,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteCode"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::HistoryOfPresentIllness))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Present Illness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHistoryOfPresentIllness(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteHistoryOfPresentIllness"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNotePhysicalExamination(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Physical Examination</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePhysicalExamination(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PhysicalExaminationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNotePhysicalExamination(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Physical Examination</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePhysicalExamination(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNotePhysicalExamination(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PHYSICAL_EXAMINATION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNotePhysicalExamination"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteProblemSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProblemSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProblemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteProblemSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProblemSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteProblemSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PROBLEM_SECTION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteProblemSection"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteProceduresSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProceduresSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProceduresSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteProceduresSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Procedures Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProceduresSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteProceduresSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PROCEDURES_SECTION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteProceduresSection"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNotePastMedicalHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Past Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePastMedicalHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PastMedicalHistorySectionConsult))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNotePastMedicalHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Past Medical History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePastMedicalHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNotePastMedicalHistorySection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNotePastMedicalHistorySection"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteImmunizationsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_IMMUNIZATIONS_SECTION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteImmunizationsSection"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteMedicationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteMedicationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteMedicationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteMedicationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteMedicationsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_MEDICATIONS_SECTION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteMedicationsSection"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteAlertsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAlertsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::AlertsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteAlertsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Alerts Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAlertsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteAlertsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_ALERTS_SECTION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteAlertsSection"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteSocialHistorySection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteSocialHistorySection"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteFamilyHistorySection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_FAMILY_HISTORY_SECTION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteFamilyHistorySection"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReviewOfSystemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteReviewOfSystemsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteReviewOfSystemsSection"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteVitalSignsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteVitalSignsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteVitalSignsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteVitalSignsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteVitalSignsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_VITAL_SIGNS_SECTION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteVitalSignsSection"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::GeneralStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note General Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteGeneralStatusSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_GENERAL_STATUS_SECTION,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteGeneralStatusSection"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteDiagnosticFindings(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Diagnostic Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteDiagnosticFindings(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::DiagnosticFindings))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteDiagnosticFindings(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Diagnostic Findings</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteDiagnosticFindings(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteDiagnosticFindings(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS,
						CDTPlugin.INSTANCE.getString("ConsultationNoteConsultationNoteDiagnosticFindings"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllness(ConsultationNote) <em>Get History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::HistoryOfPresentIllness))->asSequence()->any(true).oclAsType(cdt::HistoryOfPresentIllness)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllness(ConsultationNote) <em>Get History Of Present Illness</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HistoryOfPresentIllness getHistoryOfPresentIllness(ConsultationNote consultationNote) {

		if (GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(84));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY);
		return (HistoryOfPresentIllness) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExamination(ConsultationNote) <em>Get Physical Examination</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamination(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAMINATION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PhysicalExaminationSection))->asSequence()->any(true).oclAsType(cdt::PhysicalExaminationSection)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExamination(ConsultationNote) <em>Get Physical Examination</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamination(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAMINATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhysicalExaminationSection getPhysicalExamination(ConsultationNote consultationNote) {

		if (GET_PHYSICAL_EXAMINATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(85));
			try {
				GET_PHYSICAL_EXAMINATION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAMINATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PHYSICAL_EXAMINATION__EOCL_QRY);
		return (PhysicalExaminationSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection(ConsultationNote) <em>Get Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProblemSection))->asSequence()->any(true).oclAsType(ccd::ProblemSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection(ConsultationNote) <em>Get Problem Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProblemSection getProblemSection(ConsultationNote consultationNote) {

		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(86));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSection(ConsultationNote) <em>Get Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProceduresSection))->asSequence()->any(true).oclAsType(ccd::ProceduresSection)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSection(ConsultationNote) <em>Get Procedures Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProceduresSection getProceduresSection(ConsultationNote consultationNote) {

		if (GET_PROCEDURES_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(87));
			try {
				GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
		return (ProceduresSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPastMedicalHistorySection(ConsultationNote) <em>Get Past Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMedicalHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PastMedicalHistorySectionConsult))->asSequence()->any(true).oclAsType(cdt::PastMedicalHistorySectionConsult)";

	/**
	 * The cached OCL query for the '{@link #getPastMedicalHistorySection(ConsultationNote) <em>Get Past Medical History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMedicalHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PastMedicalHistorySectionConsult getPastMedicalHistorySection(ConsultationNote consultationNote) {

		if (GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(88));
			try {
				GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(
					GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY);
		return (PastMedicalHistorySectionConsult) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection(ConsultationNote) <em>Get Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ImmunizationsSection))->asSequence()->any(true).oclAsType(ccd::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection(ConsultationNote) <em>Get Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImmunizationsSection getImmunizationsSection(ConsultationNote consultationNote) {

		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(89));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(ConsultationNote) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))->asSequence()->any(true).oclAsType(ccd::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(ConsultationNote) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MedicationsSection getMedicationsSection(ConsultationNote consultationNote) {

		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(90));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAlertsSection(ConsultationNote) <em>Get Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALERTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::AlertsSection))->asSequence()->any(true).oclAsType(ccd::AlertsSection)";

	/**
	 * The cached OCL query for the '{@link #getAlertsSection(ConsultationNote) <em>Get Alerts Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALERTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlertsSection getAlertsSection(ConsultationNote consultationNote) {

		if (GET_ALERTS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(91));
			try {
				GET_ALERTS_SECTION__EOCL_QRY = helper.createQuery(GET_ALERTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ALERTS_SECTION__EOCL_QRY);
		return (AlertsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(ConsultationNote) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::SocialHistorySection))->asSequence()->any(true).oclAsType(ccd::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(ConsultationNote) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SocialHistorySection getSocialHistorySection(ConsultationNote consultationNote) {

		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(92));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(ConsultationNote) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FamilyHistorySection))->asSequence()->any(true).oclAsType(ccd::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(ConsultationNote) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FamilyHistorySection getFamilyHistorySection(ConsultationNote consultationNote) {

		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(93));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(ConsultationNote) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(cdt::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(ConsultationNote) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReviewOfSystemsSection getReviewOfSystemsSection(ConsultationNote consultationNote) {

		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(94));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(ConsultationNote) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::VitalSignsSection))->asSequence()->any(true).oclAsType(ccd::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(ConsultationNote) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VitalSignsSection getVitalSignsSection(ConsultationNote consultationNote) {

		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(95));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeneralStatusSection(ConsultationNote) <em>Get General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENERAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::GeneralStatusSection))->asSequence()->any(true).oclAsType(cdt::GeneralStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getGeneralStatusSection(ConsultationNote) <em>Get General Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENERAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneralStatusSection getGeneralStatusSection(ConsultationNote consultationNote) {

		if (GET_GENERAL_STATUS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(96));
			try {
				GET_GENERAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_GENERAL_STATUS_SECTION__EOCL_QRY);
		return (GeneralStatusSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiagnosticFindings(ConsultationNote) <em>Get Diagnostic Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticFindings(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DIAGNOSTIC_FINDINGS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::DiagnosticFindings))->asSequence()->any(true).oclAsType(cdt::DiagnosticFindings)";

	/**
	 * The cached OCL query for the '{@link #getDiagnosticFindings(ConsultationNote) <em>Get Diagnostic Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticFindings(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DIAGNOSTIC_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagnosticFindings getDiagnosticFindings(ConsultationNote consultationNote) {

		if (GET_DIAGNOSTIC_FINDINGS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CDTPackage.Literals.CONSULTATION_NOTE,
				CDTPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(97));
			try {
				GET_DIAGNOSTIC_FINDINGS__EOCL_QRY = helper.createQuery(GET_DIAGNOSTIC_FINDINGS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_DIAGNOSTIC_FINDINGS__EOCL_QRY);
		return (DiagnosticFindings) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralHeaderConstraintsTemplateId(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.CONSULTATION_NOTE__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						CDTPlugin.INSTANCE.getString("ConsultationNoteGeneralHeaderConstraintsTemplateId"),
						new Object[] { consultationNote }));
			}

			return false;
		}
		return true;
	}

} // ConsultationNoteOperations
