/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
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
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Admission Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdmissionMedicationOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AdmissionMedicationOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateAdmissionMedicationTemplateId(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationTemplateId(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ADMISSION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.36')";

	/**
	* The cached OCL invariant for the '{@link #validateAdmissionMedicationTemplateId(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationTemplateId(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ADMISSION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param admissionMedication The receiving '<em><b>Admission Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAdmissionMedicationTemplateId(AdmissionMedication admissionMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADMISSION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_MEDICATION);
			try {
				VALIDATE_ADMISSION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADMISSION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADMISSION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			admissionMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADMISSION_MEDICATION__ADMISSION_MEDICATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AdmissionMedicationTemplateId"),
					new Object[] { admissionMedication }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAdmissionMedicationClassCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationClassCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ADMISSION_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	* The cached OCL invariant for the '{@link #validateAdmissionMedicationClassCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationClassCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ADMISSION_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param admissionMedication The receiving '<em><b>Admission Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAdmissionMedicationClassCode(AdmissionMedication admissionMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADMISSION_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_MEDICATION);
			try {
				VALIDATE_ADMISSION_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADMISSION_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADMISSION_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			admissionMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADMISSION_MEDICATION__ADMISSION_MEDICATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("AdmissionMedicationClassCode"),
					new Object[] { admissionMedication }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAdmissionMedicationCodeP(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationCodeP(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ADMISSION_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateAdmissionMedicationCodeP(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationCodeP(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ADMISSION_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param admissionMedication The receiving '<em><b>Admission Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAdmissionMedicationCodeP(AdmissionMedication admissionMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADMISSION_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_MEDICATION);
			try {
				VALIDATE_ADMISSION_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADMISSION_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADMISSION_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			admissionMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADMISSION_MEDICATION__ADMISSION_MEDICATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("AdmissionMedicationCodeP"), new Object[] { admissionMedication }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationCodeP", passToken);
				}
				passToken.add(admissionMedication);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAdmissionMedicationCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ADMISSION_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateAdmissionMedicationCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ADMISSION_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param admissionMedication The receiving '<em><b>Admission Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAdmissionMedicationCode(AdmissionMedication admissionMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(admissionMedication)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_ADMISSION_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_MEDICATION);
			try {
				VALIDATE_ADMISSION_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADMISSION_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADMISSION_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			admissionMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADMISSION_MEDICATION__ADMISSION_MEDICATION_CODE,
					ConsolPlugin.INSTANCE.getString("AdmissionMedicationCode"), new Object[] { admissionMedication }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAdmissionMedicationMoodCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationMoodCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ADMISSION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	* The cached OCL invariant for the '{@link #validateAdmissionMedicationMoodCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationMoodCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ADMISSION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param admissionMedication The receiving '<em><b>Admission Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAdmissionMedicationMoodCode(AdmissionMedication admissionMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADMISSION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_MEDICATION);
			try {
				VALIDATE_ADMISSION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADMISSION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADMISSION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			admissionMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADMISSION_MEDICATION__ADMISSION_MEDICATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("AdmissionMedicationMoodCode"),
					new Object[] { admissionMedication }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAdmissionMedicationMedicationActivity(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Medication Activity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationMedicationActivity(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ADMISSION_MEDICATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	* The cached OCL invariant for the '{@link #validateAdmissionMedicationMedicationActivity(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Medication Activity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAdmissionMedicationMedicationActivity(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ADMISSION_MEDICATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param admissionMedication The receiving '<em><b>Admission Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAdmissionMedicationMedicationActivity(AdmissionMedication admissionMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADMISSION_MEDICATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADMISSION_MEDICATION);
			try {
				VALIDATE_ADMISSION_MEDICATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADMISSION_MEDICATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADMISSION_MEDICATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			admissionMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADMISSION_MEDICATION__ADMISSION_MEDICATION_MEDICATION_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("AdmissionMedicationMedicationActivity"),
					new Object[] { admissionMedication }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getMedicationActivities(AdmissionMedication) <em>Get Medication Activities</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationActivities(AdmissionMedication)
	* @generated
	* @ordered
	*/
	protected static final String GET_MEDICATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity)).oclAsType(consol::MedicationActivity)";

	/**
	* The cached OCL query for the '{@link #getMedicationActivities(AdmissionMedication) <em>Get Medication Activities</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationActivities(AdmissionMedication)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITIES__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static EList<MedicationActivity> getMedicationActivities(AdmissionMedication admissionMedication) {
		if (GET_MEDICATION_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ADMISSION_MEDICATION,
				ConsolPackage.Literals.ADMISSION_MEDICATION.getEAllOperations().get(57));
			try {
				GET_MEDICATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationActivity> result = (Collection<MedicationActivity>) query.evaluate(admissionMedication);
		return new BasicEList.UnmodifiableEList<MedicationActivity>(result.size(), result.toArray());
	}

} // AdmissionMedicationOperations
