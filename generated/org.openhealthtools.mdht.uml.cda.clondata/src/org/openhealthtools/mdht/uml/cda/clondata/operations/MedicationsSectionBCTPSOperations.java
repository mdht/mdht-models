/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

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
import org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Section BCTPS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS#validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section BCTPS Anthracyclines Lifetime Dose</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS#validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section BCTPS Chemotherapeutic Drug Therapy Discontinued</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS#validateMedicationsSectionBCTPSChemotherapyMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section BCTPS Chemotherapy Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS#getAnthracyclinesLifetimeDoses() <em>Get Anthracyclines Lifetime Doses</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS#getChemotherapeuticDrugTherapyDiscontinueds() <em>Get Chemotherapeutic Drug Therapy Discontinueds</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS#getChemotherapyMedicationActivities() <em>Get Chemotherapy Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS#validateMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationsSectionBCTPSOperations extends MedicationsSectionOperations {
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
	protected MedicationsSectionBCTPSOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section BCTPS Anthracyclines Lifetime Dose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_SECTION_BCTPS_ANTHRACYCLINES_LIFETIME_DOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(clondata::AnthracyclinesLifetimeDose))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section BCTPS Anthracyclines Lifetime Dose</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATIONS_SECTION_BCTPS_ANTHRACYCLINES_LIFETIME_DOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationsSectionBCTPS The receiving '<em><b>Medications Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(
			MedicationsSectionBCTPS medicationsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATIONS_SECTION_BCTPS_ANTHRACYCLINES_LIFETIME_DOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getMedicationsSectionBCTPS());
			try {
				VALIDATE_MEDICATIONS_SECTION_BCTPS_ANTHRACYCLINES_LIFETIME_DOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATIONS_SECTION_BCTPS_ANTHRACYCLINES_LIFETIME_DOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATIONS_SECTION_BCTPS_ANTHRACYCLINES_LIFETIME_DOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationsSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.MEDICATIONS_SECTION_BCTPS__MEDICATIONS_SECTION_BCTPS_ANTHRACYCLINES_LIFETIME_DOSE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MedicationsSectionBCTPSMedicationsSectionBCTPSAnthracyclinesLifetimeDose",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										medicationsSectionBCTPS, context) }),
						new Object[] { medicationsSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section BCTPS Chemotherapeutic Drug Therapy Discontinued</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(clondata::ChemotherapeuticDrugTherapyDiscontinued))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section BCTPS Chemotherapeutic Drug Therapy Discontinued</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationsSectionBCTPS The receiving '<em><b>Medications Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(
			MedicationsSectionBCTPS medicationsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getMedicationsSectionBCTPS());
			try {
				VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationsSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.MEDICATIONS_SECTION_BCTPS__MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MedicationsSectionBCTPSMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										medicationsSectionBCTPS, context) }),
						new Object[] { medicationsSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsSectionBCTPSChemotherapyMedicationActivity(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section BCTPS Chemotherapy Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionBCTPSChemotherapyMedicationActivity(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(clondata::ChemotherapyMedicationActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsSectionBCTPSChemotherapyMedicationActivity(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section BCTPS Chemotherapy Medication Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionBCTPSChemotherapyMedicationActivity(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationsSectionBCTPS The receiving '<em><b>Medications Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationsSectionBCTPSChemotherapyMedicationActivity(
			MedicationsSectionBCTPS medicationsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getMedicationsSectionBCTPS());
			try {
				VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationsSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.MEDICATIONS_SECTION_BCTPS__MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPY_MEDICATION_ACTIVITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MedicationsSectionBCTPSMedicationsSectionBCTPSChemotherapyMedicationActivity",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										medicationsSectionBCTPS, context) }),
						new Object[] { medicationsSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAnthracyclinesLifetimeDoses(MedicationsSectionBCTPS) <em>Get Anthracyclines Lifetime Doses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnthracyclinesLifetimeDoses(MedicationsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ANTHRACYCLINES_LIFETIME_DOSES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(clondata::AnthracyclinesLifetimeDose)).oclAsType(clondata::AnthracyclinesLifetimeDose)";

	/**
	 * The cached OCL query for the '{@link #getAnthracyclinesLifetimeDoses(MedicationsSectionBCTPS) <em>Get Anthracyclines Lifetime Doses</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnthracyclinesLifetimeDoses(MedicationsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ANTHRACYCLINES_LIFETIME_DOSES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AnthracyclinesLifetimeDose> getAnthracyclinesLifetimeDoses(
			MedicationsSectionBCTPS medicationsSectionBCTPS) {

		if (GET_ANTHRACYCLINES_LIFETIME_DOSES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getMedicationsSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getMedicationsSectionBCTPS().getEAllOperations().get(69));
			try {
				GET_ANTHRACYCLINES_LIFETIME_DOSES__EOCL_QRY = helper.createQuery(
					GET_ANTHRACYCLINES_LIFETIME_DOSES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ANTHRACYCLINES_LIFETIME_DOSES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AnthracyclinesLifetimeDose> result = (Collection<AnthracyclinesLifetimeDose>) query.evaluate(
			medicationsSectionBCTPS);
		return new BasicEList.UnmodifiableEList<AnthracyclinesLifetimeDose>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getChemotherapeuticDrugTherapyDiscontinueds(MedicationsSectionBCTPS) <em>Get Chemotherapeutic Drug Therapy Discontinueds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapeuticDrugTherapyDiscontinueds(MedicationsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUEDS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::ChemotherapeuticDrugTherapyDiscontinued)).oclAsType(clondata::ChemotherapeuticDrugTherapyDiscontinued)";

	/**
	 * The cached OCL query for the '{@link #getChemotherapeuticDrugTherapyDiscontinueds(MedicationsSectionBCTPS) <em>Get Chemotherapeutic Drug Therapy Discontinueds</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapeuticDrugTherapyDiscontinueds(MedicationsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUEDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ChemotherapeuticDrugTherapyDiscontinued> getChemotherapeuticDrugTherapyDiscontinueds(
			MedicationsSectionBCTPS medicationsSectionBCTPS) {

		if (GET_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUEDS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getMedicationsSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getMedicationsSectionBCTPS().getEAllOperations().get(70));
			try {
				GET_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUEDS__EOCL_QRY = helper.createQuery(
					GET_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUEDS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUEDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ChemotherapeuticDrugTherapyDiscontinued> result = (Collection<ChemotherapeuticDrugTherapyDiscontinued>) query.evaluate(
			medicationsSectionBCTPS);
		return new BasicEList.UnmodifiableEList<ChemotherapeuticDrugTherapyDiscontinued>(
			result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getChemotherapyMedicationActivities(MedicationsSectionBCTPS) <em>Get Chemotherapy Medication Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapyMedicationActivities(MedicationsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHEMOTHERAPY_MEDICATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(clondata::ChemotherapyMedicationActivity)).oclAsType(clondata::ChemotherapyMedicationActivity)";

	/**
	 * The cached OCL query for the '{@link #getChemotherapyMedicationActivities(MedicationsSectionBCTPS) <em>Get Chemotherapy Medication Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapyMedicationActivities(MedicationsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHEMOTHERAPY_MEDICATION_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ChemotherapyMedicationActivity> getChemotherapyMedicationActivities(
			MedicationsSectionBCTPS medicationsSectionBCTPS) {

		if (GET_CHEMOTHERAPY_MEDICATION_ACTIVITIES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getMedicationsSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getMedicationsSectionBCTPS().getEAllOperations().get(71));
			try {
				GET_CHEMOTHERAPY_MEDICATION_ACTIVITIES__EOCL_QRY = helper.createQuery(
					GET_CHEMOTHERAPY_MEDICATION_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CHEMOTHERAPY_MEDICATION_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ChemotherapyMedicationActivity> result = (Collection<ChemotherapyMedicationActivity>) query.evaluate(
			medicationsSectionBCTPS);
		return new BasicEList.UnmodifiableEList<ChemotherapyMedicationActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsSectionEntriesOptionalTemplateId(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionEntriesOptionalTemplateId(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.2.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsSectionEntriesOptionalTemplateId(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionEntriesOptionalTemplateId(MedicationsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationsSectionBCTPS The receiving '<em><b>Medications Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationsSectionEntriesOptionalTemplateId(
			MedicationsSectionBCTPS medicationsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getMedicationsSectionBCTPS());
			try {
				VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicationsSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.MEDICATIONS_SECTION_BCTPS__MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MedicationsSectionBCTPSMedicationsSectionEntriesOptionalTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										medicationsSectionBCTPS, context) }),
						new Object[] { medicationsSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

} // MedicationsSectionBCTPSOperations
