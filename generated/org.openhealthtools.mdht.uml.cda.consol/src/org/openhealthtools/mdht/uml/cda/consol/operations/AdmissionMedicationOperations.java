/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#getMedicationActivity() <em>Get Medication Activity</em>}</li>
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
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.36')
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
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
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
	 * The cached OCL expression body for the '{@link #validateAdmissionMedicationCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdmissionMedicationCode(AdmissionMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADMISSION_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '42346-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

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
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = '42346-7' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param admissionMedication The receiving '<em><b>Admission Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdmissionMedicationCode(AdmissionMedication admissionMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
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
	 * self.moodCode=vocab::x_DocumentActMood::EVN
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
	protected static final String VALIDATE_ADMISSION_MEDICATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

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
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
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
	 * The cached OCL expression body for the '{@link #getMedicationActivity(AdmissionMedication) <em>Get Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity(AdmissionMedication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ACTIVITY__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity))->asSequence()->first().oclAsType(consol::MedicationActivity)";

	/**
	 * The cached OCL query for the '{@link #getMedicationActivity(AdmissionMedication) <em>Get Medication Activity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity(AdmissionMedication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity))->asSequence()->first().oclAsType(consol::MedicationActivity)
	 * @param admissionMedication The receiving '<em><b>Admission Medication</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationActivity getMedicationActivity(AdmissionMedication admissionMedication) {
		if (GET_MEDICATION_ACTIVITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ADMISSION_MEDICATION,
				ConsolPackage.Literals.ADMISSION_MEDICATION.getEAllOperations().get(56));
			try {
				GET_MEDICATION_ACTIVITY__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTIVITY__EOCL_QRY);
		return (MedicationActivity) query.evaluate(admissionMedication);
	}

} // AdmissionMedicationOperations
