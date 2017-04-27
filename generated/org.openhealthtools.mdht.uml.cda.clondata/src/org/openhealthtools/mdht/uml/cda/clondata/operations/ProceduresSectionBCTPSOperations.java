/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSectionEntriesOptionalOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section BCTPS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS#validateProceduresSectionBCTPSBreastCancerProcedures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section BCTPS Breast Cancer Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS#validateProceduresSectionBCTPSRadiationTherapyCareCompleted(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section BCTPS Radiation Therapy Care Completed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS#getBreastCancerProcedures() <em>Get Breast Cancer Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS#getRadiationTherapyCareCompleted() <em>Get Radiation Therapy Care Completed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS#getMolecularDiagnosticTestingOrganizer() <em>Get Molecular Diagnostic Testing Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProceduresSectionBCTPSOperations extends ProceduresSectionEntriesOptionalOperations {
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
	protected ProceduresSectionBCTPSOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionBCTPSBreastCancerProcedures(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section BCTPS Breast Cancer Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionBCTPSBreastCancerProcedures(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_BCTPS_BREAST_CANCER_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(clondata::BreastCancerProcedures))";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionBCTPSBreastCancerProcedures(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section BCTPS Breast Cancer Procedures</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionBCTPSBreastCancerProcedures(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_SECTION_BCTPS_BREAST_CANCER_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSectionBCTPS The receiving '<em><b>Procedures Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProceduresSectionBCTPSBreastCancerProcedures(
			ProceduresSectionBCTPS proceduresSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_SECTION_BCTPS_BREAST_CANCER_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getProceduresSectionBCTPS());
			try {
				VALIDATE_PROCEDURES_SECTION_BCTPS_BREAST_CANCER_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURES_SECTION_BCTPS_BREAST_CANCER_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURES_SECTION_BCTPS_BREAST_CANCER_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				proceduresSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PROCEDURES_SECTION_BCTPS__PROCEDURES_SECTION_BCTPS_BREAST_CANCER_PROCEDURES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ProceduresSectionBCTPSProceduresSectionBCTPSBreastCancerProcedures",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										proceduresSectionBCTPS, context) }),
						new Object[] { proceduresSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionBCTPSRadiationTherapyCareCompleted(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section BCTPS Radiation Therapy Care Completed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionBCTPSRadiationTherapyCareCompleted(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_BCTPS_RADIATION_THERAPY_CARE_COMPLETED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(clondata::RadiationTherapyCareCompleted))";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionBCTPSRadiationTherapyCareCompleted(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section BCTPS Radiation Therapy Care Completed</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionBCTPSRadiationTherapyCareCompleted(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_SECTION_BCTPS_RADIATION_THERAPY_CARE_COMPLETED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSectionBCTPS The receiving '<em><b>Procedures Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProceduresSectionBCTPSRadiationTherapyCareCompleted(
			ProceduresSectionBCTPS proceduresSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_SECTION_BCTPS_RADIATION_THERAPY_CARE_COMPLETED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getProceduresSectionBCTPS());
			try {
				VALIDATE_PROCEDURES_SECTION_BCTPS_RADIATION_THERAPY_CARE_COMPLETED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURES_SECTION_BCTPS_RADIATION_THERAPY_CARE_COMPLETED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURES_SECTION_BCTPS_RADIATION_THERAPY_CARE_COMPLETED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				proceduresSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PROCEDURES_SECTION_BCTPS__PROCEDURES_SECTION_BCTPS_RADIATION_THERAPY_CARE_COMPLETED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ProceduresSectionBCTPSProceduresSectionBCTPSRadiationTherapyCareCompleted",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										proceduresSectionBCTPS, context) }),
						new Object[] { proceduresSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getBreastCancerProcedures(ProceduresSectionBCTPS) <em>Get Breast Cancer Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreastCancerProcedures(ProceduresSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BREAST_CANCER_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(clondata::BreastCancerProcedures))->asSequence()->any(true).oclAsType(clondata::BreastCancerProcedures)";

	/**
	 * The cached OCL query for the '{@link #getBreastCancerProcedures(ProceduresSectionBCTPS) <em>Get Breast Cancer Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreastCancerProcedures(ProceduresSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BREAST_CANCER_PROCEDURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static BreastCancerProcedures getBreastCancerProcedures(ProceduresSectionBCTPS proceduresSectionBCTPS) {

		if (GET_BREAST_CANCER_PROCEDURES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getProceduresSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getProceduresSectionBCTPS().getEAllOperations().get(68));
			try {
				GET_BREAST_CANCER_PROCEDURES__EOCL_QRY = helper.createQuery(GET_BREAST_CANCER_PROCEDURES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_BREAST_CANCER_PROCEDURES__EOCL_QRY);
		return (BreastCancerProcedures) query.evaluate(proceduresSectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRadiationTherapyCareCompleted(ProceduresSectionBCTPS) <em>Get Radiation Therapy Care Completed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiationTherapyCareCompleted(ProceduresSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RADIATION_THERAPY_CARE_COMPLETED__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::RadiationTherapyCareCompleted))->asSequence()->any(true).oclAsType(clondata::RadiationTherapyCareCompleted)";

	/**
	 * The cached OCL query for the '{@link #getRadiationTherapyCareCompleted(ProceduresSectionBCTPS) <em>Get Radiation Therapy Care Completed</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiationTherapyCareCompleted(ProceduresSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RADIATION_THERAPY_CARE_COMPLETED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static RadiationTherapyCareCompleted getRadiationTherapyCareCompleted(
			ProceduresSectionBCTPS proceduresSectionBCTPS) {

		if (GET_RADIATION_THERAPY_CARE_COMPLETED__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getProceduresSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getProceduresSectionBCTPS().getEAllOperations().get(69));
			try {
				GET_RADIATION_THERAPY_CARE_COMPLETED__EOCL_QRY = helper.createQuery(
					GET_RADIATION_THERAPY_CARE_COMPLETED__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_RADIATION_THERAPY_CARE_COMPLETED__EOCL_QRY);
		return (RadiationTherapyCareCompleted) query.evaluate(proceduresSectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMolecularDiagnosticTestingOrganizer(ProceduresSectionBCTPS) <em>Get Molecular Diagnostic Testing Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularDiagnosticTestingOrganizer(ProceduresSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(clondata::MolecularDiagnosticTestingOrganizer))->asSequence()->any(true).oclAsType(clondata::MolecularDiagnosticTestingOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getMolecularDiagnosticTestingOrganizer(ProceduresSectionBCTPS) <em>Get Molecular Diagnostic Testing Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularDiagnosticTestingOrganizer(ProceduresSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MolecularDiagnosticTestingOrganizer getMolecularDiagnosticTestingOrganizer(
			ProceduresSectionBCTPS proceduresSectionBCTPS) {

		if (GET_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getProceduresSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getProceduresSectionBCTPS().getEAllOperations().get(70));
			try {
				GET_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__EOCL_QRY = helper.createQuery(
					GET_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__EOCL_QRY);
		return (MolecularDiagnosticTestingOrganizer) query.evaluate(proceduresSectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.2.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSectionBCTPS The receiving '<em><b>Procedures Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProceduresSectionEntriesOptionalTemplateId(
			ProceduresSectionBCTPS proceduresSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getProceduresSectionBCTPS());
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				proceduresSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PROCEDURES_SECTION_BCTPS__PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ProceduresSectionBCTPSProceduresSectionEntriesOptionalTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										proceduresSectionBCTPS, context) }),
						new Object[] { proceduresSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

} // ProceduresSectionBCTPSOperations
