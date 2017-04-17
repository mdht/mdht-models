/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Drug Trial</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial#validateClinicalDrugTrialTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial#validateClinicalDrugTrialClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial#validateClinicalDrugTrialCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial#validateClinicalDrugTrialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial#validateClinicalDrugTrialMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial#validateClinicalDrugTrialStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial#validateClinicalDrugTrialStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Status Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalDrugTrialOperations extends ClinicalStatementOperations {
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
	protected ClinicalDrugTrialOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalDrugTrialTemplateId(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialTemplateId(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_DRUG_TRIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalDrugTrialTemplateId(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialTemplateId(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_DRUG_TRIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalDrugTrial The receiving '<em><b>Clinical Drug Trial</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalDrugTrialTemplateId(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_DRUG_TRIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalDrugTrial());
			try {
				VALIDATE_CLINICAL_DRUG_TRIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CLINICAL_DRUG_TRIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_DRUG_TRIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalDrugTrial)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalDrugTrialClinicalDrugTrialTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalDrugTrial, context) }),
						new Object[] { clinicalDrugTrial }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalDrugTrialClassCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialClassCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_DRUG_TRIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalDrugTrialClassCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialClassCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_DRUG_TRIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalDrugTrial The receiving '<em><b>Clinical Drug Trial</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalDrugTrialClassCode(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_DRUG_TRIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalDrugTrial());
			try {
				VALIDATE_CLINICAL_DRUG_TRIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CLINICAL_DRUG_TRIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_DRUG_TRIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalDrugTrial)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalDrugTrialClinicalDrugTrialClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalDrugTrial, context) }),
						new Object[] { clinicalDrugTrial }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalDrugTrialCodeP(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialCodeP(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_DRUG_TRIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalDrugTrialCodeP(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialCodeP(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_DRUG_TRIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalDrugTrial The receiving '<em><b>Clinical Drug Trial</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalDrugTrialCodeP(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_DRUG_TRIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalDrugTrial());
			try {
				VALIDATE_CLINICAL_DRUG_TRIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CLINICAL_DRUG_TRIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_DRUG_TRIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalDrugTrial)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalDrugTrialClinicalDrugTrialCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalDrugTrial, context) }),
						new Object[] { clinicalDrugTrial }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalDrugTrialCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_DRUG_TRIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '185922005' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalDrugTrialCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_DRUG_TRIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalDrugTrial The receiving '<em><b>Clinical Drug Trial</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalDrugTrialCode(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_DRUG_TRIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalDrugTrial());
			try {
				VALIDATE_CLINICAL_DRUG_TRIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CLINICAL_DRUG_TRIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_DRUG_TRIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			clinicalDrugTrial)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalDrugTrialClinicalDrugTrialCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalDrugTrial, context) }),
						new Object[] { clinicalDrugTrial }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalDrugTrialMoodCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialMoodCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_DRUG_TRIAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalDrugTrialMoodCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialMoodCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_DRUG_TRIAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalDrugTrial The receiving '<em><b>Clinical Drug Trial</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalDrugTrialMoodCode(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_DRUG_TRIAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalDrugTrial());
			try {
				VALIDATE_CLINICAL_DRUG_TRIAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CLINICAL_DRUG_TRIAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_DRUG_TRIAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalDrugTrial)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalDrugTrialClinicalDrugTrialMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalDrugTrial, context) }),
						new Object[] { clinicalDrugTrial }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalDrugTrial The receiving '<em><b>Clinical Drug Trial</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalDrugTrialStatusCodeP(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalDrugTrial());
			try {
				VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalDrugTrial)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_STATUS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalDrugTrialClinicalDrugTrialStatusCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalDrugTrial, context) }),
						new Object[] { clinicalDrugTrial }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalDrugTrialStatusCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialStatusCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalDrugTrialStatusCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialStatusCode(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalDrugTrialStatusCodeP(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialStatusCodeP(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalDrugTrialStatusCodeP(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Drug Trial Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalDrugTrialStatusCodeP(ClinicalDrugTrial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalDrugTrial The receiving '<em><b>Clinical Drug Trial</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalDrugTrialStatusCode(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalDrugTrial());
			try {
				VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_DRUG_TRIAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalDrugTrial)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalDrugTrialClinicalDrugTrialStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalDrugTrial, context) }),
						new Object[] { clinicalDrugTrial }));
			}

			return false;
		}
		return true;
	}

} // ClinicalDrugTrialOperations
