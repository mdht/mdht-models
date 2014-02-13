/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Equipment Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#validateMedicalEquipmentOrganizerProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer#getProcedureActivityProcedures() <em>Get Procedure Activity Procedures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicalEquipmentOrganizerOperations extends OrganizerOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected MedicalEquipmentOrganizerOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicalEquipmentOrganizerTemplateId(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerTemplateId(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.135')";

	/**
	* The cached OCL invariant for the '{@link #validateMedicalEquipmentOrganizerTemplateId(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerTemplateId(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicalEquipmentOrganizer The receiving '<em><b>Medical Equipment Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicalEquipmentOrganizerTemplateId(
			MedicalEquipmentOrganizer medicalEquipmentOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicalEquipmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICAL_EQUIPMENT_ORGANIZER__MEDICAL_EQUIPMENT_ORGANIZER_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MedicalEquipmentOrganizerTemplateId"),
					new Object[] { medicalEquipmentOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicalEquipmentOrganizerClassCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerClassCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER";

	/**
	* The cached OCL invariant for the '{@link #validateMedicalEquipmentOrganizerClassCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerClassCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicalEquipmentOrganizer The receiving '<em><b>Medical Equipment Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicalEquipmentOrganizerClassCode(
			MedicalEquipmentOrganizer medicalEquipmentOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicalEquipmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICAL_EQUIPMENT_ORGANIZER__MEDICAL_EQUIPMENT_ORGANIZER_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("MedicalEquipmentOrganizerClassCode"),
					new Object[] { medicalEquipmentOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicalEquipmentOrganizerMoodCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerMoodCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

	/**
	* The cached OCL invariant for the '{@link #validateMedicalEquipmentOrganizerMoodCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerMoodCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicalEquipmentOrganizer The receiving '<em><b>Medical Equipment Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicalEquipmentOrganizerMoodCode(
			MedicalEquipmentOrganizer medicalEquipmentOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicalEquipmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICAL_EQUIPMENT_ORGANIZER__MEDICAL_EQUIPMENT_ORGANIZER_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("MedicalEquipmentOrganizerMoodCode"),
					new Object[] { medicalEquipmentOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicalEquipmentOrganizerId(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerId(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateMedicalEquipmentOrganizerId(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerId(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicalEquipmentOrganizer The receiving '<em><b>Medical Equipment Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicalEquipmentOrganizerId(MedicalEquipmentOrganizer medicalEquipmentOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicalEquipmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICAL_EQUIPMENT_ORGANIZER__MEDICAL_EQUIPMENT_ORGANIZER_ID,
					ConsolPlugin.INSTANCE.getString("MedicalEquipmentOrganizerId"),
					new Object[] { medicalEquipmentOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicalEquipmentOrganizerCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateMedicalEquipmentOrganizerCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicalEquipmentOrganizer The receiving '<em><b>Medical Equipment Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicalEquipmentOrganizerCode(MedicalEquipmentOrganizer medicalEquipmentOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicalEquipmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICAL_EQUIPMENT_ORGANIZER__MEDICAL_EQUIPMENT_ORGANIZER_CODE,
					ConsolPlugin.INSTANCE.getString("MedicalEquipmentOrganizerCode"),
					new Object[] { medicalEquipmentOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicalEquipmentOrganizerStatusCodeP(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Status Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerStatusCodeP(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateMedicalEquipmentOrganizerStatusCodeP(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Status Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerStatusCodeP(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicalEquipmentOrganizer The receiving '<em><b>Medical Equipment Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicalEquipmentOrganizerStatusCodeP(
			MedicalEquipmentOrganizer medicalEquipmentOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicalEquipmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICAL_EQUIPMENT_ORGANIZER__MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("MedicalEquipmentOrganizerStatusCodeP"),
					new Object[] { medicalEquipmentOrganizer }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizerStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizerStatusCodeP", passToken);
				}
				passToken.add(medicalEquipmentOrganizer);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicalEquipmentOrganizerStatusCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Status Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerStatusCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "
			+ "value.code = 'aborted' or value.code = 'active' or value.code = 'cancelled' or value.code = 'completed' or value.code = 'held' or value.code = 'suspended')";

	/**
	* The cached OCL invariant for the '{@link #validateMedicalEquipmentOrganizerStatusCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Status Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerStatusCode(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicalEquipmentOrganizer The receiving '<em><b>Medical Equipment Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicalEquipmentOrganizerStatusCode(
			MedicalEquipmentOrganizer medicalEquipmentOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizerStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicalEquipmentOrganizer)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicalEquipmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICAL_EQUIPMENT_ORGANIZER__MEDICAL_EQUIPMENT_ORGANIZER_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("MedicalEquipmentOrganizerStatusCode"),
					new Object[] { medicalEquipmentOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicalEquipmentOrganizerEffectiveTime(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerEffectiveTime(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateMedicalEquipmentOrganizerEffectiveTime(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerEffectiveTime(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicalEquipmentOrganizer The receiving '<em><b>Medical Equipment Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicalEquipmentOrganizerEffectiveTime(
			MedicalEquipmentOrganizer medicalEquipmentOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicalEquipmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICAL_EQUIPMENT_ORGANIZER__MEDICAL_EQUIPMENT_ORGANIZER_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("MedicalEquipmentOrganizerEffectiveTime"),
					new Object[] { medicalEquipmentOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Non Medicinal Supply Activity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.supply.oclIsUndefined() and component.supply.oclIsKindOf(consol::NonMedicinalSupplyActivity))";

	/**
	* The cached OCL invariant for the '{@link #validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Non Medicinal Supply Activity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicalEquipmentOrganizer The receiving '<em><b>Medical Equipment Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity(
			MedicalEquipmentOrganizer medicalEquipmentOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicalEquipmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICAL_EQUIPMENT_ORGANIZER__MEDICAL_EQUIPMENT_ORGANIZER_NON_MEDICINAL_SUPPLY_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("MedicalEquipmentOrganizerNonMedicinalSupplyActivity"),
					new Object[] { medicalEquipmentOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicalEquipmentOrganizerProcedureActivityProcedure(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Procedure Activity Procedure</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerProcedureActivityProcedure(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.procedure.oclIsUndefined() and component.procedure.oclIsKindOf(consol::ProcedureActivityProcedure))";

	/**
	* The cached OCL invariant for the '{@link #validateMedicalEquipmentOrganizerProcedureActivityProcedure(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Organizer Procedure Activity Procedure</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicalEquipmentOrganizerProcedureActivityProcedure(MedicalEquipmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param medicalEquipmentOrganizer The receiving '<em><b>Medical Equipment Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicalEquipmentOrganizerProcedureActivityProcedure(
			MedicalEquipmentOrganizer medicalEquipmentOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICAL_EQUIPMENT_ORGANIZER_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicalEquipmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICAL_EQUIPMENT_ORGANIZER__MEDICAL_EQUIPMENT_ORGANIZER_PROCEDURE_ACTIVITY_PROCEDURE,
					ConsolPlugin.INSTANCE.getString("MedicalEquipmentOrganizerProcedureActivityProcedure"),
					new Object[] { medicalEquipmentOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getNonMedicinalSupplyActivities(MedicalEquipmentOrganizer) <em>Get Non Medicinal Supply Activities</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getNonMedicinalSupplyActivities(MedicalEquipmentOrganizer)
	* @generated
	* @ordered
	*/
	protected static final String GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity)).oclAsType(consol::NonMedicinalSupplyActivity)";

	/**
	* The cached OCL query for the '{@link #getNonMedicinalSupplyActivities(MedicalEquipmentOrganizer) <em>Get Non Medicinal Supply Activities</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getNonMedicinalSupplyActivities(MedicalEquipmentOrganizer)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities(
			MedicalEquipmentOrganizer medicalEquipmentOrganizer) {
		if (GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER,
				ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER.getEAllOperations().get(62));
			try {
				GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonMedicinalSupplyActivity> result = (Collection<NonMedicinalSupplyActivity>) query.evaluate(medicalEquipmentOrganizer);
		return new BasicEList.UnmodifiableEList<NonMedicinalSupplyActivity>(result.size(), result.toArray());
	}

	/**
	* The cached OCL expression body for the '{@link #getProcedureActivityProcedures(MedicalEquipmentOrganizer) <em>Get Procedure Activity Procedures</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureActivityProcedures(MedicalEquipmentOrganizer)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure)).oclAsType(consol::ProcedureActivityProcedure)";

	/**
	* The cached OCL query for the '{@link #getProcedureActivityProcedures(MedicalEquipmentOrganizer) <em>Get Procedure Activity Procedures</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureActivityProcedures(MedicalEquipmentOrganizer)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static EList<ProcedureActivityProcedure> getProcedureActivityProcedures(
			MedicalEquipmentOrganizer medicalEquipmentOrganizer) {
		if (GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER,
				ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER.getEAllOperations().get(63));
			try {
				GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityProcedure> result = (Collection<ProcedureActivityProcedure>) query.evaluate(medicalEquipmentOrganizer);
		return new BasicEList.UnmodifiableEList<ProcedureActivityProcedure>(result.size(), result.toArray());
	}

} // MedicalEquipmentOrganizerOperations
