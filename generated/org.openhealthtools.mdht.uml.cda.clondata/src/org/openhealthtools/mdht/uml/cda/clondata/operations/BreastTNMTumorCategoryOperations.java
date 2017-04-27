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
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Breast TNM Tumor Category</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory#validateBreastTNMTumorCategoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory#validateBreastTNMTumorCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory#validateBreastTNMTumorCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory#validateBreastTNMTumorCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory#validateBreastTNMTumorCategoryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory#validateBreastTNMTumorCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory#validateBreastTNMTumorCategoryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory#validateBreastTNMTumorCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory#validateBreastTNMTumorCategoryValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreastTNMTumorCategoryOperations extends ClinicalStatementOperations {
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
	protected BreastTNMTumorCategoryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMTumorCategoryTemplateId(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryTemplateId(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_TUMOR_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMTumorCategoryTemplateId(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryTemplateId(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_TUMOR_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMTumorCategory The receiving '<em><b>Breast TNM Tumor Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMTumorCategoryTemplateId(BreastTNMTumorCategory breastTNMTumorCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_TUMOR_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMTumorCategory());
			try {
				VALIDATE_BREAST_TNM_TUMOR_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_TUMOR_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_TUMOR_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMTumorCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMTumorCategoryBreastTNMTumorCategoryTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMTumorCategory, context) }),
						new Object[] { breastTNMTumorCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMTumorCategoryClassCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryClassCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMTumorCategoryClassCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryClassCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMTumorCategory The receiving '<em><b>Breast TNM Tumor Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMTumorCategoryClassCode(BreastTNMTumorCategory breastTNMTumorCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMTumorCategory());
			try {
				VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMTumorCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMTumorCategoryBreastTNMTumorCategoryClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMTumorCategory, context) }),
						new Object[] { breastTNMTumorCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMTumorCategoryCodeP(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryCodeP(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMTumorCategoryCodeP(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryCodeP(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMTumorCategory The receiving '<em><b>Breast TNM Tumor Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMTumorCategoryCodeP(BreastTNMTumorCategory breastTNMTumorCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMTumorCategory());
			try {
				VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMTumorCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMTumorCategoryBreastTNMTumorCategoryCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMTumorCategory, context) }),
						new Object[] { breastTNMTumorCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMTumorCategoryCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMTumorCategoryCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMTumorCategory The receiving '<em><b>Breast TNM Tumor Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMTumorCategoryCode(BreastTNMTumorCategory breastTNMTumorCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMTumorCategory());
			try {
				VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_TUMOR_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMTumorCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMTumorCategoryBreastTNMTumorCategoryCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMTumorCategory, context) }),
						new Object[] { breastTNMTumorCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMTumorCategoryEffectiveTime(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryEffectiveTime(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_TUMOR_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMTumorCategoryEffectiveTime(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryEffectiveTime(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_TUMOR_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMTumorCategory The receiving '<em><b>Breast TNM Tumor Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMTumorCategoryEffectiveTime(BreastTNMTumorCategory breastTNMTumorCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_TUMOR_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMTumorCategory());
			try {
				VALIDATE_BREAST_TNM_TUMOR_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_TUMOR_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_TUMOR_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMTumorCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMTumorCategoryBreastTNMTumorCategoryEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMTumorCategory, context) }),
						new Object[] { breastTNMTumorCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMTumorCategoryMoodCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryMoodCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_TUMOR_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMTumorCategoryMoodCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryMoodCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_TUMOR_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMTumorCategory The receiving '<em><b>Breast TNM Tumor Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMTumorCategoryMoodCode(BreastTNMTumorCategory breastTNMTumorCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_TUMOR_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMTumorCategory());
			try {
				VALIDATE_BREAST_TNM_TUMOR_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_TUMOR_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_TUMOR_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMTumorCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMTumorCategoryBreastTNMTumorCategoryMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMTumorCategory, context) }),
						new Object[] { breastTNMTumorCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMTumorCategoryStatusCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryStatusCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_TUMOR_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMTumorCategoryStatusCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryStatusCode(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_TUMOR_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMTumorCategory The receiving '<em><b>Breast TNM Tumor Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMTumorCategoryStatusCode(BreastTNMTumorCategory breastTNMTumorCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_TUMOR_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMTumorCategory());
			try {
				VALIDATE_BREAST_TNM_TUMOR_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_TUMOR_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_TUMOR_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMTumorCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMTumorCategoryBreastTNMTumorCategoryStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMTumorCategory, context) }),
						new Object[] { breastTNMTumorCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMTumorCategoryValue(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryValue(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMTumorCategoryValue(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryValue(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMTumorCategory The receiving '<em><b>Breast TNM Tumor Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMTumorCategoryValue(BreastTNMTumorCategory breastTNMTumorCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMTumorCategory());
			try {
				VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMTumorCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMTumorCategoryBreastTNMTumorCategoryValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMTumorCategory, context) }),
						new Object[] { breastTNMTumorCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMTumorCategoryValueP(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryValueP(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMTumorCategoryValueP(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Tumor Category Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMTumorCategoryValueP(BreastTNMTumorCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMTumorCategory The receiving '<em><b>Breast TNM Tumor Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMTumorCategoryValueP(BreastTNMTumorCategory breastTNMTumorCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMTumorCategory());
			try {
				VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_TUMOR_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMTumorCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_VALUE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMTumorCategoryBreastTNMTumorCategoryValueP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMTumorCategory, context) }),
						new Object[] { breastTNMTumorCategory }));
			}

			return false;
		}
		return true;
	}

} // BreastTNMTumorCategoryOperations
