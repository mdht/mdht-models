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
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Breast TNM Node Category</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory#validateBreastTNMNodeCategoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory#validateBreastTNMNodeCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory#validateBreastTNMNodeCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory#validateBreastTNMNodeCategoryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory#validateBreastTNMNodeCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory#validateBreastTNMNodeCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreastTNMNodeCategoryOperations extends ClinicalStatementOperations {
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
	protected BreastTNMNodeCategoryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMNodeCategoryTemplateId(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryTemplateId(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_NODE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMNodeCategoryTemplateId(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryTemplateId(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_NODE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMNodeCategory The receiving '<em><b>Breast TNM Node Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMNodeCategoryTemplateId(BreastTNMNodeCategory breastTNMNodeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_NODE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMNodeCategory());
			try {
				VALIDATE_BREAST_TNM_NODE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_NODE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_NODE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMNodeCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMNodeCategoryBreastTNMNodeCategoryTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMNodeCategory, context) }),
						new Object[] { breastTNMNodeCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMNodeCategoryClassCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryClassCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_NODE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMNodeCategoryClassCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryClassCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_NODE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMNodeCategory The receiving '<em><b>Breast TNM Node Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMNodeCategoryClassCode(BreastTNMNodeCategory breastTNMNodeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_NODE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMNodeCategory());
			try {
				VALIDATE_BREAST_TNM_NODE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_NODE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_NODE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMNodeCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMNodeCategoryBreastTNMNodeCategoryClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMNodeCategory, context) }),
						new Object[] { breastTNMNodeCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMNodeCategoryCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_NODE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMNodeCategoryCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_NODE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMNodeCategory The receiving '<em><b>Breast TNM Node Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMNodeCategoryCode(BreastTNMNodeCategory breastTNMNodeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_NODE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMNodeCategory());
			try {
				VALIDATE_BREAST_TNM_NODE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BREAST_TNM_NODE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_NODE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMNodeCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMNodeCategoryBreastTNMNodeCategoryCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMNodeCategory, context) }),
						new Object[] { breastTNMNodeCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMNodeCategoryEffectiveTime(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryEffectiveTime(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_NODE_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMNodeCategoryEffectiveTime(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryEffectiveTime(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_NODE_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMNodeCategory The receiving '<em><b>Breast TNM Node Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMNodeCategoryEffectiveTime(BreastTNMNodeCategory breastTNMNodeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_NODE_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMNodeCategory());
			try {
				VALIDATE_BREAST_TNM_NODE_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_NODE_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_NODE_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMNodeCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMNodeCategoryBreastTNMNodeCategoryEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMNodeCategory, context) }),
						new Object[] { breastTNMNodeCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMNodeCategoryMoodCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryMoodCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_NODE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMNodeCategoryMoodCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryMoodCode(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_NODE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMNodeCategory The receiving '<em><b>Breast TNM Node Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMNodeCategoryMoodCode(BreastTNMNodeCategory breastTNMNodeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_NODE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMNodeCategory());
			try {
				VALIDATE_BREAST_TNM_NODE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_NODE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_NODE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMNodeCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMNodeCategoryBreastTNMNodeCategoryMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMNodeCategory, context) }),
						new Object[] { breastTNMNodeCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMNodeCategoryValue(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryValue(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_NODE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMNodeCategoryValue(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Node Category Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMNodeCategoryValue(BreastTNMNodeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_NODE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMNodeCategory The receiving '<em><b>Breast TNM Node Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMNodeCategoryValue(BreastTNMNodeCategory breastTNMNodeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_NODE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMNodeCategory());
			try {
				VALIDATE_BREAST_TNM_NODE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BREAST_TNM_NODE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_NODE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMNodeCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMNodeCategoryBreastTNMNodeCategoryValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMNodeCategory, context) }),
						new Object[] { breastTNMNodeCategory }));
			}

			return false;
		}
		return true;
	}

} // BreastTNMNodeCategoryOperations
