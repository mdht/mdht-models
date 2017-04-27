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
import org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Post Treatment Disease Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus#validatePostTreatmentDiseaseStatusTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus#validatePostTreatmentDiseaseStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus#validatePostTreatmentDiseaseStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus#validatePostTreatmentDiseaseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus#validatePostTreatmentDiseaseStatusEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus#validatePostTreatmentDiseaseStatusId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus#validatePostTreatmentDiseaseStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus#validatePostTreatmentDiseaseStatusStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus#validatePostTreatmentDiseaseStatusStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus#validatePostTreatmentDiseaseStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus#validatePostTreatmentDiseaseStatusValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostTreatmentDiseaseStatusOperations extends ClinicalStatementOperations {
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
	protected PostTreatmentDiseaseStatusOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostTreatmentDiseaseStatusTemplateId(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusTemplateId(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_TREATMENT_DISEASE_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.29')";

	/**
	 * The cached OCL invariant for the '{@link #validatePostTreatmentDiseaseStatusTemplateId(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusTemplateId(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_POST_TREATMENT_DISEASE_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postTreatmentDiseaseStatus The receiving '<em><b>Post Treatment Disease Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostTreatmentDiseaseStatusTemplateId(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POST_TREATMENT_DISEASE_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus());
			try {
				VALIDATE_POST_TREATMENT_DISEASE_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_POST_TREATMENT_DISEASE_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_POST_TREATMENT_DISEASE_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				postTreatmentDiseaseStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PostTreatmentDiseaseStatusPostTreatmentDiseaseStatusTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										postTreatmentDiseaseStatus, context) }),
						new Object[] { postTreatmentDiseaseStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostTreatmentDiseaseStatusClassCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusClassCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_TREATMENT_DISEASE_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePostTreatmentDiseaseStatusClassCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusClassCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_POST_TREATMENT_DISEASE_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postTreatmentDiseaseStatus The receiving '<em><b>Post Treatment Disease Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostTreatmentDiseaseStatusClassCode(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POST_TREATMENT_DISEASE_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus());
			try {
				VALIDATE_POST_TREATMENT_DISEASE_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_POST_TREATMENT_DISEASE_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_POST_TREATMENT_DISEASE_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				postTreatmentDiseaseStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PostTreatmentDiseaseStatusPostTreatmentDiseaseStatusClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										postTreatmentDiseaseStatus, context) }),
						new Object[] { postTreatmentDiseaseStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostTreatmentDiseaseStatusCodeP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusCodeP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePostTreatmentDiseaseStatusCodeP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusCodeP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postTreatmentDiseaseStatus The receiving '<em><b>Post Treatment Disease Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostTreatmentDiseaseStatusCodeP(PostTreatmentDiseaseStatus postTreatmentDiseaseStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus());
			try {
				VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				postTreatmentDiseaseStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PostTreatmentDiseaseStatusPostTreatmentDiseaseStatusCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										postTreatmentDiseaseStatus, context) }),
						new Object[] { postTreatmentDiseaseStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostTreatmentDiseaseStatusCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '405178006' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validatePostTreatmentDiseaseStatusCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postTreatmentDiseaseStatus The receiving '<em><b>Post Treatment Disease Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostTreatmentDiseaseStatusCode(PostTreatmentDiseaseStatus postTreatmentDiseaseStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus());
			try {
				VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_POST_TREATMENT_DISEASE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				postTreatmentDiseaseStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PostTreatmentDiseaseStatusPostTreatmentDiseaseStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										postTreatmentDiseaseStatus, context) }),
						new Object[] { postTreatmentDiseaseStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostTreatmentDiseaseStatusEffectiveTime(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusEffectiveTime(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_TREATMENT_DISEASE_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePostTreatmentDiseaseStatusEffectiveTime(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusEffectiveTime(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_POST_TREATMENT_DISEASE_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postTreatmentDiseaseStatus The receiving '<em><b>Post Treatment Disease Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostTreatmentDiseaseStatusEffectiveTime(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POST_TREATMENT_DISEASE_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus());
			try {
				VALIDATE_POST_TREATMENT_DISEASE_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_POST_TREATMENT_DISEASE_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_POST_TREATMENT_DISEASE_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				postTreatmentDiseaseStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PostTreatmentDiseaseStatusPostTreatmentDiseaseStatusEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										postTreatmentDiseaseStatus, context) }),
						new Object[] { postTreatmentDiseaseStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostTreatmentDiseaseStatusId(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusId(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_TREATMENT_DISEASE_STATUS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePostTreatmentDiseaseStatusId(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusId(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_POST_TREATMENT_DISEASE_STATUS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postTreatmentDiseaseStatus The receiving '<em><b>Post Treatment Disease Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostTreatmentDiseaseStatusId(PostTreatmentDiseaseStatus postTreatmentDiseaseStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POST_TREATMENT_DISEASE_STATUS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus());
			try {
				VALIDATE_POST_TREATMENT_DISEASE_STATUS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_POST_TREATMENT_DISEASE_STATUS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_POST_TREATMENT_DISEASE_STATUS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				postTreatmentDiseaseStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PostTreatmentDiseaseStatusPostTreatmentDiseaseStatusId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										postTreatmentDiseaseStatus, context) }),
						new Object[] { postTreatmentDiseaseStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostTreatmentDiseaseStatusMoodCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusMoodCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_TREATMENT_DISEASE_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePostTreatmentDiseaseStatusMoodCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusMoodCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_POST_TREATMENT_DISEASE_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postTreatmentDiseaseStatus The receiving '<em><b>Post Treatment Disease Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostTreatmentDiseaseStatusMoodCode(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POST_TREATMENT_DISEASE_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus());
			try {
				VALIDATE_POST_TREATMENT_DISEASE_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_POST_TREATMENT_DISEASE_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_POST_TREATMENT_DISEASE_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				postTreatmentDiseaseStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PostTreatmentDiseaseStatusPostTreatmentDiseaseStatusMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										postTreatmentDiseaseStatus, context) }),
						new Object[] { postTreatmentDiseaseStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postTreatmentDiseaseStatus The receiving '<em><b>Post Treatment Disease Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostTreatmentDiseaseStatusStatusCodeP(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus());
			try {
				VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				postTreatmentDiseaseStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_STATUS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PostTreatmentDiseaseStatusPostTreatmentDiseaseStatusStatusCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										postTreatmentDiseaseStatus, context) }),
						new Object[] { postTreatmentDiseaseStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostTreatmentDiseaseStatusStatusCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusStatusCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validatePostTreatmentDiseaseStatusStatusCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusStatusCode(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validatePostTreatmentDiseaseStatusStatusCodeP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusStatusCodeP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePostTreatmentDiseaseStatusStatusCodeP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusStatusCodeP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postTreatmentDiseaseStatus The receiving '<em><b>Post Treatment Disease Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostTreatmentDiseaseStatusStatusCode(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus());
			try {
				VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_POST_TREATMENT_DISEASE_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				postTreatmentDiseaseStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PostTreatmentDiseaseStatusPostTreatmentDiseaseStatusStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										postTreatmentDiseaseStatus, context) }),
						new Object[] { postTreatmentDiseaseStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostTreatmentDiseaseStatusValue(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusValue(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePostTreatmentDiseaseStatusValue(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusValue(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postTreatmentDiseaseStatus The receiving '<em><b>Post Treatment Disease Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostTreatmentDiseaseStatusValue(PostTreatmentDiseaseStatus postTreatmentDiseaseStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus());
			try {
				VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				postTreatmentDiseaseStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PostTreatmentDiseaseStatusPostTreatmentDiseaseStatusValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										postTreatmentDiseaseStatus, context) }),
						new Object[] { postTreatmentDiseaseStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostTreatmentDiseaseStatusValueP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusValueP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePostTreatmentDiseaseStatusValueP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Treatment Disease Status Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostTreatmentDiseaseStatusValueP(PostTreatmentDiseaseStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postTreatmentDiseaseStatus The receiving '<em><b>Post Treatment Disease Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostTreatmentDiseaseStatusValueP(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus());
			try {
				VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_POST_TREATMENT_DISEASE_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				postTreatmentDiseaseStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_VALUE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PostTreatmentDiseaseStatusPostTreatmentDiseaseStatusValueP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										postTreatmentDiseaseStatus, context) }),
						new Object[] { postTreatmentDiseaseStatus }));
			}

			return false;
		}
		return true;
	}

} // PostTreatmentDiseaseStatusOperations
