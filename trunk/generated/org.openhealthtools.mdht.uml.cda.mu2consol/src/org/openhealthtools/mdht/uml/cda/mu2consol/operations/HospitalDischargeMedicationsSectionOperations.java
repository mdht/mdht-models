/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

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

import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Hospital Discharge Medications Section</b></em>' model
 * objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection#validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Hospital Discharge Medications Section Discharge
 * Medication</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection#validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Hospital Discharge Medications Section Medication
 * Activity</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection#getmu2consolDischargeMedications()
 * <em>Getmu2consol Discharge Medications</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection#getMedicationActivity()
 * <em>Get Medication Activity</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class HospitalDischargeMedicationsSectionOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeMedicationsSectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HospitalDischargeMedicationsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Mu2consol Hospital Discharge Medications Section Discharge Medication</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(HospitalDischargeMedicationsSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_DISCHARGE_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::DischargeMedication))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Mu2consol Hospital Discharge Medications Section Discharge Medication</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(HospitalDischargeMedicationsSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_DISCHARGE_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined()
	 * and entry.act.oclIsKindOf(consol::DischargeMedication))
	 * 
	 * @param hospitalDischargeMedicationsSection
	 *            The receiving '
	 *            <em><b>Hospital Discharge Medications Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_DISCHARGE_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION);
			try {
				VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_DISCHARGE_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_DISCHARGE_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_DISCHARGE_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(hospitalDischargeMedicationsSection)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_DISCHARGE_MEDICATION,
								org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
										.getString(
												"_UI_GenericInvariant_diagnostic",
												new Object[] {
														"Mu2consolHospitalDischargeMedicationsSectionDischargeMedication",
														org.eclipse.emf.ecore.util.EObjectValidator
																.getObjectLabel(
																		hospitalDischargeMedicationsSection,
																		context) }),
								new Object[] { hospitalDischargeMedicationsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Mu2consol Hospital Discharge Medications Section Medication Activity</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(HospitalDischargeMedicationsSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Mu2consol Hospital Discharge Medications Section Medication Activity</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(HospitalDischargeMedicationsSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not
	 * entry.substanceAdministration.oclIsUndefined() and
	 * entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity))
	 * 
	 * @param hospitalDischargeMedicationsSection
	 *            The receiving '
	 *            <em><b>Hospital Discharge Medications Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION);
			try {
				VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(hospitalDischargeMedicationsSection)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION_ACTIVITY,
								org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
										.getString(
												"_UI_GenericInvariant_diagnostic",
												new Object[] {
														"Mu2consolHospitalDischargeMedicationsSectionMedicationActivity",
														org.eclipse.emf.ecore.util.EObjectValidator
																.getObjectLabel(
																		hospitalDischargeMedicationsSection,
																		context) }),
								new Object[] { hospitalDischargeMedicationsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getmu2consolDischargeMedications(HospitalDischargeMedicationsSection)
	 * <em>Getmu2consol Discharge Medications</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getmu2consolDischargeMedications(HospitalDischargeMedicationsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETMU2CONSOL_DISCHARGE_MEDICATIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::DischargeMedication)).oclAsType(consol::DischargeMedication)";

	/**
	 * The cached OCL query for the '
	 * {@link #getmu2consolDischargeMedications(HospitalDischargeMedicationsSection)
	 * <em>Getmu2consol Discharge Medications</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getmu2consolDischargeMedications(HospitalDischargeMedicationsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETMU2CONSOL_DISCHARGE_MEDICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and
	 * act.oclIsKindOf
	 * (consol::DischargeMedication)).oclAsType(consol::DischargeMedication)
	 * 
	 * @param hospitalDischargeMedicationsSection
	 *            The receiving '
	 *            <em><b>Hospital Discharge Medications Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<DischargeMedication> getmu2consolDischargeMedications(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection) {
		if (GETMU2CONSOL_DISCHARGE_MEDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION,
					Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION
							.getEAllOperations().get(67));
			try {
				GETMU2CONSOL_DISCHARGE_MEDICATIONS__EOCL_QRY = helper
						.createQuery(GETMU2CONSOL_DISCHARGE_MEDICATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GETMU2CONSOL_DISCHARGE_MEDICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<DischargeMedication> result = (Collection<DischargeMedication>) query
				.evaluate(hospitalDischargeMedicationsSection);
		return new BasicEList.UnmodifiableEList<DischargeMedication>(
				result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getMedicationActivity(HospitalDischargeMedicationsSection)
	 * <em>Get Medication Activity</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMedicationActivity(HospitalDischargeMedicationsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ACTIVITY__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity))->asSequence()->any(true).oclAsType(consol::MedicationActivity)";

	/**
	 * The cached OCL query for the '
	 * {@link #getMedicationActivity(HospitalDischargeMedicationsSection)
	 * <em>Get Medication Activity</em>}' query operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getMedicationActivity(HospitalDischargeMedicationsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration :
	 * cda::SubstanceAdministration | not
	 * substanceAdministration.oclIsUndefined() and
	 * substanceAdministration.oclIsKindOf
	 * (consol::MedicationActivity))->asSequence
	 * ()->any(true).oclAsType(consol::MedicationActivity)
	 * 
	 * @param hospitalDischargeMedicationsSection
	 *            The receiving '
	 *            <em><b>Hospital Discharge Medications Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static MedicationActivity getMedicationActivity(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection) {
		if (GET_MEDICATION_ACTIVITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION,
					Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION
							.getEAllOperations().get(68));
			try {
				GET_MEDICATION_ACTIVITY__EOCL_QRY = helper
						.createQuery(GET_MEDICATION_ACTIVITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_MEDICATION_ACTIVITY__EOCL_QRY);
		return (MedicationActivity) query
				.evaluate(hospitalDischargeMedicationsSection);
	}

} // HospitalDischargeMedicationsSectionOperations