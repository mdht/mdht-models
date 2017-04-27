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
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chemotherapy Regimen Plans</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans#validateChemotherapyRegimenPlansTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans#validateChemotherapyRegimenPlansClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans#validateChemotherapyRegimenPlansCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans#validateChemotherapyRegimenPlansCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans#validateChemotherapyRegimenPlansEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans#validateChemotherapyRegimenPlansStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans#validateChemotherapyRegimenPlansMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans#validateChemotherapyRegimenPlansChemotherapyMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Chemotherapy Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans#validateChemotherapyRegimenPlansClinicalDrugTrial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Clinical Drug Trial</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans#getChemotherapyMedicationActivities() <em>Get Chemotherapy Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans#getClinicalDrugTrials() <em>Get Clinical Drug Trials</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChemotherapyRegimenPlansOperations extends ClinicalStatementOperations {
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
	protected ChemotherapyRegimenPlansOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyRegimenPlansTemplateId(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansTemplateId(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.30')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyRegimenPlansTemplateId(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansTemplateId(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyRegimenPlans The receiving '<em><b>Chemotherapy Regimen Plans</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyRegimenPlansTemplateId(ChemotherapyRegimenPlans chemotherapyRegimenPlans,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans());
			try {
				VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyRegimenPlans)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyRegimenPlansChemotherapyRegimenPlansTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyRegimenPlans, context) }),
						new Object[] { chemotherapyRegimenPlans }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyRegimenPlansClassCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansClassCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::PROC";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyRegimenPlansClassCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansClassCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyRegimenPlans The receiving '<em><b>Chemotherapy Regimen Plans</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyRegimenPlansClassCode(ChemotherapyRegimenPlans chemotherapyRegimenPlans,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans());
			try {
				VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyRegimenPlans)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyRegimenPlansChemotherapyRegimenPlansClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyRegimenPlans, context) }),
						new Object[] { chemotherapyRegimenPlans }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyRegimenPlans The receiving '<em><b>Chemotherapy Regimen Plans</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyRegimenPlansCodeP(ChemotherapyRegimenPlans chemotherapyRegimenPlans,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans());
			try {
				VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyRegimenPlans)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyRegimenPlansChemotherapyRegimenPlansCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyRegimenPlans, context) }),
						new Object[] { chemotherapyRegimenPlans }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyRegimenPlansCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '69960004' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyRegimenPlansCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyRegimenPlansCodeP(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansCodeP(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyRegimenPlansCodeP(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansCodeP(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyRegimenPlans The receiving '<em><b>Chemotherapy Regimen Plans</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyRegimenPlansCode(ChemotherapyRegimenPlans chemotherapyRegimenPlans,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans());
			try {
				VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyRegimenPlans)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyRegimenPlansChemotherapyRegimenPlansCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyRegimenPlans, context) }),
						new Object[] { chemotherapyRegimenPlans }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyRegimenPlansEffectiveTime(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansEffectiveTime(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyRegimenPlansEffectiveTime(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansEffectiveTime(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyRegimenPlans The receiving '<em><b>Chemotherapy Regimen Plans</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyRegimenPlansEffectiveTime(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans());
			try {
				VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyRegimenPlans)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyRegimenPlansChemotherapyRegimenPlansEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyRegimenPlans, context) }),
						new Object[] { chemotherapyRegimenPlans }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyRegimenPlansStatusCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansStatusCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyRegimenPlansStatusCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansStatusCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyRegimenPlans The receiving '<em><b>Chemotherapy Regimen Plans</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyRegimenPlansStatusCode(ChemotherapyRegimenPlans chemotherapyRegimenPlans,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans());
			try {
				VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyRegimenPlans)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyRegimenPlansChemotherapyRegimenPlansStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyRegimenPlans, context) }),
						new Object[] { chemotherapyRegimenPlans }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyRegimenPlansMoodCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansMoodCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyRegimenPlansMoodCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansMoodCode(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyRegimenPlans The receiving '<em><b>Chemotherapy Regimen Plans</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyRegimenPlansMoodCode(ChemotherapyRegimenPlans chemotherapyRegimenPlans,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans());
			try {
				VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyRegimenPlans)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyRegimenPlansChemotherapyRegimenPlansMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyRegimenPlans, context) }),
						new Object[] { chemotherapyRegimenPlans }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyRegimenPlansChemotherapyMedicationActivity(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Chemotherapy Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansChemotherapyMedicationActivity(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(clondata::ChemotherapyMedicationActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyRegimenPlansChemotherapyMedicationActivity(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Chemotherapy Medication Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansChemotherapyMedicationActivity(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyRegimenPlans The receiving '<em><b>Chemotherapy Regimen Plans</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyRegimenPlansChemotherapyMedicationActivity(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans());
			try {
				VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CHEMOTHERAPY_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyRegimenPlans)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_CHEMOTHERAPY_MEDICATION_ACTIVITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyRegimenPlansChemotherapyRegimenPlansChemotherapyMedicationActivity",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyRegimenPlans, context) }),
						new Object[] { chemotherapyRegimenPlans }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyRegimenPlansClinicalDrugTrial(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Clinical Drug Trial</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansClinicalDrugTrial(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(clondata::ClinicalDrugTrial))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyRegimenPlansClinicalDrugTrial(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Regimen Plans Clinical Drug Trial</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyRegimenPlansClinicalDrugTrial(ChemotherapyRegimenPlans, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyRegimenPlans The receiving '<em><b>Chemotherapy Regimen Plans</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyRegimenPlansClinicalDrugTrial(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans());
			try {
				VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_REGIMEN_PLANS_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyRegimenPlans)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_CLINICAL_DRUG_TRIAL,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyRegimenPlansChemotherapyRegimenPlansClinicalDrugTrial",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyRegimenPlans, context) }),
						new Object[] { chemotherapyRegimenPlans }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getChemotherapyMedicationActivities(ChemotherapyRegimenPlans) <em>Get Chemotherapy Medication Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapyMedicationActivities(ChemotherapyRegimenPlans)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHEMOTHERAPY_MEDICATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(clondata::ChemotherapyMedicationActivity)).oclAsType(clondata::ChemotherapyMedicationActivity)";

	/**
	 * The cached OCL query for the '{@link #getChemotherapyMedicationActivities(ChemotherapyRegimenPlans) <em>Get Chemotherapy Medication Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapyMedicationActivities(ChemotherapyRegimenPlans)
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
			ChemotherapyRegimenPlans chemotherapyRegimenPlans) {

		if (GET_CHEMOTHERAPY_MEDICATION_ACTIVITIES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans(),
				CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans().getEAllOperations().get(60));
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
			chemotherapyRegimenPlans);
		return new BasicEList.UnmodifiableEList<ChemotherapyMedicationActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getClinicalDrugTrials(ChemotherapyRegimenPlans) <em>Get Clinical Drug Trials</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalDrugTrials(ChemotherapyRegimenPlans)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CLINICAL_DRUG_TRIALS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::ClinicalDrugTrial)).oclAsType(clondata::ClinicalDrugTrial)";

	/**
	 * The cached OCL query for the '{@link #getClinicalDrugTrials(ChemotherapyRegimenPlans) <em>Get Clinical Drug Trials</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalDrugTrials(ChemotherapyRegimenPlans)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CLINICAL_DRUG_TRIALS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ClinicalDrugTrial> getClinicalDrugTrials(ChemotherapyRegimenPlans chemotherapyRegimenPlans) {

		if (GET_CLINICAL_DRUG_TRIALS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans(),
				CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans().getEAllOperations().get(61));
			try {
				GET_CLINICAL_DRUG_TRIALS__EOCL_QRY = helper.createQuery(GET_CLINICAL_DRUG_TRIALS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CLINICAL_DRUG_TRIALS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ClinicalDrugTrial> result = (Collection<ClinicalDrugTrial>) query.evaluate(chemotherapyRegimenPlans);
		return new BasicEList.UnmodifiableEList<ClinicalDrugTrial>(result.size(), result.toArray());
	}

} // ChemotherapyRegimenPlansOperations
