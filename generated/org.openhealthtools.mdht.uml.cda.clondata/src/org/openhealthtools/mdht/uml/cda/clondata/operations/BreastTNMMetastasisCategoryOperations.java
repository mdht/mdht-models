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
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Breast TNM Metastasis Category</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory#validateBreastTNMMetastasisCategoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory#validateBreastTNMMetastasisCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory#validateBreastTNMMetastasisCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory#validateBreastTNMMetastasisCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory#validateBreastTNMMetastasisCategoryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory#validateBreastTNMMetastasisCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory#validateBreastTNMMetastasisCategoryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory#validateBreastTNMMetastasisCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreastTNMMetastasisCategoryOperations extends ClinicalStatementOperations {
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
	protected BreastTNMMetastasisCategoryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMMetastasisCategoryTemplateId(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryTemplateId(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMMetastasisCategoryTemplateId(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryTemplateId(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMMetastasisCategory The receiving '<em><b>Breast TNM Metastasis Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMMetastasisCategoryTemplateId(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMMetastasisCategory());
			try {
				VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMMetastasisCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMMetastasisCategoryBreastTNMMetastasisCategoryTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMMetastasisCategory, context) }),
						new Object[] { breastTNMMetastasisCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMMetastasisCategoryClassCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryClassCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMMetastasisCategoryClassCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryClassCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMMetastasisCategory The receiving '<em><b>Breast TNM Metastasis Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMMetastasisCategoryClassCode(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMMetastasisCategory());
			try {
				VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMMetastasisCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMMetastasisCategoryBreastTNMMetastasisCategoryClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMMetastasisCategory, context) }),
						new Object[] { breastTNMMetastasisCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMMetastasisCategoryCodeP(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryCodeP(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMMetastasisCategoryCodeP(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryCodeP(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMMetastasisCategory The receiving '<em><b>Breast TNM Metastasis Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMMetastasisCategoryCodeP(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMMetastasisCategory());
			try {
				VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMMetastasisCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMMetastasisCategoryBreastTNMMetastasisCategoryCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMMetastasisCategory, context) }),
						new Object[] { breastTNMMetastasisCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMMetastasisCategoryCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMMetastasisCategoryCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMMetastasisCategory The receiving '<em><b>Breast TNM Metastasis Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMMetastasisCategoryCode(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMMetastasisCategory());
			try {
				VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMMetastasisCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMMetastasisCategoryBreastTNMMetastasisCategoryCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMMetastasisCategory, context) }),
						new Object[] { breastTNMMetastasisCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMMetastasisCategoryEffectiveTime(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryEffectiveTime(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMMetastasisCategoryEffectiveTime(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryEffectiveTime(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMMetastasisCategory The receiving '<em><b>Breast TNM Metastasis Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMMetastasisCategoryEffectiveTime(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMMetastasisCategory());
			try {
				VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMMetastasisCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMMetastasisCategoryBreastTNMMetastasisCategoryEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMMetastasisCategory, context) }),
						new Object[] { breastTNMMetastasisCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMMetastasisCategoryMoodCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryMoodCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMMetastasisCategoryMoodCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryMoodCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMMetastasisCategory The receiving '<em><b>Breast TNM Metastasis Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMMetastasisCategoryMoodCode(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMMetastasisCategory());
			try {
				VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMMetastasisCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMMetastasisCategoryBreastTNMMetastasisCategoryMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMMetastasisCategory, context) }),
						new Object[] { breastTNMMetastasisCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMMetastasisCategoryStatusCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryStatusCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMMetastasisCategoryStatusCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryStatusCode(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMMetastasisCategory The receiving '<em><b>Breast TNM Metastasis Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMMetastasisCategoryStatusCode(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMMetastasisCategory());
			try {
				VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMMetastasisCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMMetastasisCategoryBreastTNMMetastasisCategoryStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMMetastasisCategory, context) }),
						new Object[] { breastTNMMetastasisCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMMetastasisCategoryValue(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryValue(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMMetastasisCategoryValue(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Metastasis Category Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMMetastasisCategoryValue(BreastTNMMetastasisCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMMetastasisCategory The receiving '<em><b>Breast TNM Metastasis Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMMetastasisCategoryValue(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMMetastasisCategory());
			try {
				VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_METASTASIS_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMMetastasisCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMMetastasisCategoryBreastTNMMetastasisCategoryValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMMetastasisCategory, context) }),
						new Object[] { breastTNMMetastasisCategory }));
			}

			return false;
		}
		return true;
	}

} // BreastTNMMetastasisCategoryOperations
