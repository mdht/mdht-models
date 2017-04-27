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
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Breast TNM Clinical Category</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryEntryRelationshipObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryEntryRelationshipObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory#validateBreastTNMClinicalCategoryEntryRelationshipObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreastTNMClinicalCategoryOperations extends ClinicalStatementOperations {
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
	protected BreastTNMClinicalCategoryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryTemplateId(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryTemplateId(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryTemplateId(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryTemplateId(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryTemplateId(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryClassCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryClassCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryClassCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryClassCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryClassCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryCodeP(BreastTNMClinicalCategory breastTNMClinicalCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '254326001' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryCode(BreastTNMClinicalCategory breastTNMClinicalCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryEffectiveTime(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEffectiveTime(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryEffectiveTime(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEffectiveTime(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryEffectiveTime(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryId(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryId(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryId(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryId(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryId(BreastTNMClinicalCategory breastTNMClinicalCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryMoodCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryMoodCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryMoodCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryMoodCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryMoodCode(BreastTNMClinicalCategory breastTNMClinicalCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryEntryRelationshipObservationClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryEntryRelationshipObservationCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = code.oclAsType(datatypes::CD) in " +
			"value.code = '21908-9' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryEntryRelationshipObservationCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined() and statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationValue(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationValue(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined())))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservationValue(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservationValue(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationValue(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryEntryRelationshipObservationValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipTypeCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipTypeCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipTypeCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipTypeCode(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryEntryRelationshipTypeCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_TYPE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryEntryRelationshipTypeCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservation(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservation(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastTNMClinicalCategoryEntryRelationshipObservation(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast TNM Clinical Category Entry Relationship Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastTNMClinicalCategoryEntryRelationshipObservation(BreastTNMClinicalCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastTNMClinicalCategory The receiving '<em><b>Breast TNM Clinical Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastTNMClinicalCategoryEntryRelationshipObservation(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory());
			try {
				VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastTNMClinicalCategory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastTNMClinicalCategoryBreastTNMClinicalCategoryEntryRelationshipObservation",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastTNMClinicalCategory, context) }),
						new Object[] { breastTNMClinicalCategory }));
			}

			return false;
		}
		return true;
	}

} // BreastTNMClinicalCategoryOperations
