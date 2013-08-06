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
import org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Current Medication Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateCurrentMedicationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateCurrentMedicationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateCurrentMedicationSectionCurrentlyOnMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Currently On Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateCurrentMedicationSectionPatientOnAnticoagulants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Patient On Anticoagulants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateCurrentMedicationSectionCurrentMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#getCurrentlyOnMedication() <em>Get Currently On Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#getPatientOnAnticoagulants() <em>Get Patient On Anticoagulants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#getCurrentMedication() <em>Get Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrentMedicationSectionOperations extends MedicationsSectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected CurrentMedicationSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateCurrentMedicationSectionTitle(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationSectionTitle(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Current Medications Section')";

	/**
	* The cached OCL invariant for the '{@link #validateCurrentMedicationSectionTitle(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationSectionTitle(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedicationSection The receiving '<em><b>Current Medication Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCurrentMedicationSectionTitle(CurrentMedicationSection currentMedicationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION_SECTION__CURRENT_MEDICATION_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("CurrentMedicationSectionTitle"),
					new Object[] { currentMedicationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCurrentMedicationSectionText(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationSectionText(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateCurrentMedicationSectionText(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationSectionText(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedicationSection The receiving '<em><b>Current Medication Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCurrentMedicationSectionText(CurrentMedicationSection currentMedicationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION_SECTION__CURRENT_MEDICATION_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("CurrentMedicationSectionText"),
					new Object[] { currentMedicationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCurrentMedicationSectionCurrentlyOnMedication(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Currently On Medication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationSectionCurrentlyOnMedication(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::CurrentlyOnMedication) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateCurrentMedicationSectionCurrentlyOnMedication(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Currently On Medication</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationSectionCurrentlyOnMedication(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedicationSection The receiving '<em><b>Current Medication Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCurrentMedicationSectionCurrentlyOnMedication(
			CurrentMedicationSection currentMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION_SECTION__CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION,
					EmspcrPlugin.INSTANCE.getString("CurrentMedicationSectionCurrentlyOnMedication"),
					new Object[] { currentMedicationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCurrentMedicationSectionPatientOnAnticoagulants(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Patient On Anticoagulants</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationSectionPatientOnAnticoagulants(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientOnAnticoagulants) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateCurrentMedicationSectionPatientOnAnticoagulants(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Patient On Anticoagulants</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationSectionPatientOnAnticoagulants(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedicationSection The receiving '<em><b>Current Medication Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCurrentMedicationSectionPatientOnAnticoagulants(
			CurrentMedicationSection currentMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION_SECTION__CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS,
					EmspcrPlugin.INSTANCE.getString("CurrentMedicationSectionPatientOnAnticoagulants"),
					new Object[] { currentMedicationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCurrentMedicationSectionCurrentMedication(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Current Medication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationSectionCurrentMedication(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(emspcr::CurrentMedication) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateCurrentMedicationSectionCurrentMedication(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Current Medication</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationSectionCurrentMedication(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedicationSection The receiving '<em><b>Current Medication Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCurrentMedicationSectionCurrentMedication(
			CurrentMedicationSection currentMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION_SECTION__CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION,
					EmspcrPlugin.INSTANCE.getString("CurrentMedicationSectionCurrentMedication"),
					new Object[] { currentMedicationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getCurrentlyOnMedication(CurrentMedicationSection) <em>Get Currently On Medication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getCurrentlyOnMedication(CurrentMedicationSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_CURRENTLY_ON_MEDICATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CurrentlyOnMedication))->asSequence()->any(true).oclAsType(emspcr::CurrentlyOnMedication)";

	/**
	* The cached OCL query for the '{@link #getCurrentlyOnMedication(CurrentMedicationSection) <em>Get Currently On Medication</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getCurrentlyOnMedication(CurrentMedicationSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_CURRENTLY_ON_MEDICATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static CurrentlyOnMedication getCurrentlyOnMedication(CurrentMedicationSection currentMedicationSection) {
		if (GET_CURRENTLY_ON_MEDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION,
				EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION.getEAllOperations().get(71));
			try {
				GET_CURRENTLY_ON_MEDICATION__EOCL_QRY = helper.createQuery(GET_CURRENTLY_ON_MEDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CURRENTLY_ON_MEDICATION__EOCL_QRY);
		return (CurrentlyOnMedication) query.evaluate(currentMedicationSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getPatientOnAnticoagulants(CurrentMedicationSection) <em>Get Patient On Anticoagulants</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPatientOnAnticoagulants(CurrentMedicationSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PATIENT_ON_ANTICOAGULANTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientOnAnticoagulants))->asSequence()->any(true).oclAsType(emspcr::PatientOnAnticoagulants)";

	/**
	* The cached OCL query for the '{@link #getPatientOnAnticoagulants(CurrentMedicationSection) <em>Get Patient On Anticoagulants</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPatientOnAnticoagulants(CurrentMedicationSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PATIENT_ON_ANTICOAGULANTS__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static PatientOnAnticoagulants getPatientOnAnticoagulants(CurrentMedicationSection currentMedicationSection) {
		if (GET_PATIENT_ON_ANTICOAGULANTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION,
				EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION.getEAllOperations().get(72));
			try {
				GET_PATIENT_ON_ANTICOAGULANTS__EOCL_QRY = helper.createQuery(GET_PATIENT_ON_ANTICOAGULANTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_ON_ANTICOAGULANTS__EOCL_QRY);
		return (PatientOnAnticoagulants) query.evaluate(currentMedicationSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getCurrentMedication(CurrentMedicationSection) <em>Get Current Medication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getCurrentMedication(CurrentMedicationSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_CURRENT_MEDICATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(emspcr::CurrentMedication))->asSequence()->any(true).oclAsType(emspcr::CurrentMedication)";

	/**
	* The cached OCL query for the '{@link #getCurrentMedication(CurrentMedicationSection) <em>Get Current Medication</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getCurrentMedication(CurrentMedicationSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_CURRENT_MEDICATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static CurrentMedication getCurrentMedication(CurrentMedicationSection currentMedicationSection) {
		if (GET_CURRENT_MEDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION,
				EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION.getEAllOperations().get(73));
			try {
				GET_CURRENT_MEDICATION__EOCL_QRY = helper.createQuery(GET_CURRENT_MEDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CURRENT_MEDICATION__EOCL_QRY);
		return (CurrentMedication) query.evaluate(currentMedicationSection);
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationsSectionEntriesOptionalTemplateId(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationsSectionEntriesOptionalTemplateId(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.15')";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationsSectionEntriesOptionalTemplateId(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationsSectionEntriesOptionalTemplateId(CurrentMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedicationSection The receiving '<em><b>Current Medication Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationsSectionEntriesOptionalTemplateId(
			CurrentMedicationSection currentMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION);
			try {
				VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION_SECTION__MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MedicationsSectionEntriesOptionalTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									currentMedicationSection, context) }), new Object[] { currentMedicationSection }));
			}

			return false;
		}
		return true;
	}

} // CurrentMedicationSectionOperations
