/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsSectionOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Current Medication Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionCurrentlyOnMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Currently On Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionPatientOnAnticoagulants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Patient On Anticoagulants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionCurrentMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#getCurrentlyOnMedication() <em>Get Currently On Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#getPatientOnAnticoagulants() <em>Get Patient On Anticoagulants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#getCurrentMedication() <em>Get Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSCurrentMedicationSectionOperations extends MedicationsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSCurrentMedicationSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCurrentMedicationSectionCode(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionCode(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67844-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCurrentMedicationSectionCode(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionCode(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCurrentMedicationSection The receiving '<em><b>EMS Current Medication Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSCurrentMedicationSectionCode(
			EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCurrentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSCurrentMedicationSectionCode"),
					new Object[] { emsCurrentMedicationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCurrentMedicationSectionTitle(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionTitle(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Current Medications Section')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCurrentMedicationSectionTitle(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionTitle(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCurrentMedicationSection The receiving '<em><b>EMS Current Medication Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSCurrentMedicationSectionTitle(
			EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCurrentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSCurrentMedicationSectionTitle"),
					new Object[] { emsCurrentMedicationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCurrentMedicationSectionText(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionText(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCurrentMedicationSectionText(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionText(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCurrentMedicationSection The receiving '<em><b>EMS Current Medication Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSCurrentMedicationSectionText(
			EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCurrentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSCurrentMedicationSectionText"),
					new Object[] { emsCurrentMedicationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCurrentMedicationSectionCurrentlyOnMedication(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Currently On Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionCurrentlyOnMedication(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::CurrentlyOnMedication) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCurrentMedicationSectionCurrentlyOnMedication(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Currently On Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionCurrentlyOnMedication(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCurrentMedicationSection The receiving '<em><b>EMS Current Medication Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSCurrentMedicationSectionCurrentlyOnMedication(
			EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCurrentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION,
					EmspcrPlugin.INSTANCE.getString("EMSCurrentMedicationSectionCurrentlyOnMedication"),
					new Object[] { emsCurrentMedicationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCurrentMedicationSectionPatientOnAnticoagulants(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Patient On Anticoagulants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionPatientOnAnticoagulants(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientOnAnticoagulants) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCurrentMedicationSectionPatientOnAnticoagulants(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Patient On Anticoagulants</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionPatientOnAnticoagulants(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCurrentMedicationSection The receiving '<em><b>EMS Current Medication Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSCurrentMedicationSectionPatientOnAnticoagulants(
			EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_EMS_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCurrentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS,
					EmspcrPlugin.INSTANCE.getString("EMSCurrentMedicationSectionPatientOnAnticoagulants"),
					new Object[] { emsCurrentMedicationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCurrentMedicationSectionCurrentMedication(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Current Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionCurrentMedication(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(emspcr::CurrentMedication) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCurrentMedicationSectionCurrentMedication(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Current Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCurrentMedicationSectionCurrentMedication(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCurrentMedicationSection The receiving '<em><b>EMS Current Medication Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSCurrentMedicationSectionCurrentMedication(
			EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCurrentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION,
					EmspcrPlugin.INSTANCE.getString("EMSCurrentMedicationSectionCurrentMedication"),
					new Object[] { emsCurrentMedicationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCurrentlyOnMedication(EMSCurrentMedicationSection) <em>Get Currently On Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyOnMedication(EMSCurrentMedicationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CURRENTLY_ON_MEDICATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CurrentlyOnMedication))->asSequence()->any(true).oclAsType(emspcr::CurrentlyOnMedication)";

	/**
	 * The cached OCL query for the '{@link #getCurrentlyOnMedication(EMSCurrentMedicationSection) <em>Get Currently On Medication</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyOnMedication(EMSCurrentMedicationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CURRENTLY_ON_MEDICATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CurrentlyOnMedication getCurrentlyOnMedication(EMSCurrentMedicationSection emsCurrentMedicationSection) {
		if (GET_CURRENTLY_ON_MEDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION,
				EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION.getEAllOperations().get(72));
			try {
				GET_CURRENTLY_ON_MEDICATION__EOCL_QRY = helper.createQuery(GET_CURRENTLY_ON_MEDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CURRENTLY_ON_MEDICATION__EOCL_QRY);
		return (CurrentlyOnMedication) query.evaluate(emsCurrentMedicationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientOnAnticoagulants(EMSCurrentMedicationSection) <em>Get Patient On Anticoagulants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientOnAnticoagulants(EMSCurrentMedicationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_ON_ANTICOAGULANTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientOnAnticoagulants))->asSequence()->any(true).oclAsType(emspcr::PatientOnAnticoagulants)";

	/**
	 * The cached OCL query for the '{@link #getPatientOnAnticoagulants(EMSCurrentMedicationSection) <em>Get Patient On Anticoagulants</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientOnAnticoagulants(EMSCurrentMedicationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_ON_ANTICOAGULANTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PatientOnAnticoagulants getPatientOnAnticoagulants(
			EMSCurrentMedicationSection emsCurrentMedicationSection) {
		if (GET_PATIENT_ON_ANTICOAGULANTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION,
				EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION.getEAllOperations().get(73));
			try {
				GET_PATIENT_ON_ANTICOAGULANTS__EOCL_QRY = helper.createQuery(GET_PATIENT_ON_ANTICOAGULANTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_ON_ANTICOAGULANTS__EOCL_QRY);
		return (PatientOnAnticoagulants) query.evaluate(emsCurrentMedicationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCurrentMedication(EMSCurrentMedicationSection) <em>Get Current Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMedication(EMSCurrentMedicationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CURRENT_MEDICATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(emspcr::CurrentMedication))->asSequence()->any(true).oclAsType(emspcr::CurrentMedication)";

	/**
	 * The cached OCL query for the '{@link #getCurrentMedication(EMSCurrentMedicationSection) <em>Get Current Medication</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMedication(EMSCurrentMedicationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CURRENT_MEDICATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CurrentMedication getCurrentMedication(EMSCurrentMedicationSection emsCurrentMedicationSection) {
		if (GET_CURRENT_MEDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION,
				EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION.getEAllOperations().get(74));
			try {
				GET_CURRENT_MEDICATION__EOCL_QRY = helper.createQuery(GET_CURRENT_MEDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CURRENT_MEDICATION__EOCL_QRY);
		return (CurrentMedication) query.evaluate(emsCurrentMedicationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsSectionEntriesOptionalTemplateId(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionEntriesOptionalTemplateId(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.15')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsSectionEntriesOptionalTemplateId(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionEntriesOptionalTemplateId(EMSCurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCurrentMedicationSection The receiving '<em><b>EMS Current Medication Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationsSectionEntriesOptionalTemplateId(
			EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCurrentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CURRENT_MEDICATION_SECTION__MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("MedicationsSectionEntriesOptionalTemplateId"),
					new Object[] { emsCurrentMedicationSection }));
			}

			return false;
		}
		return true;
	}

} // EMSCurrentMedicationSectionOperations
