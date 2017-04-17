/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Breast Cancer Procedures</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures#validateBreastCancerProceduresCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Procedures Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures#validateBreastCancerProceduresCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Procedures Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures#validateBreastCancerProceduresEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Procedures Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreastCancerProceduresOperations extends ProcedureActivityProcedureOperations {
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
	protected BreastCancerProceduresOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastCancerProceduresCodeP(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Procedures Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerProceduresCodeP(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_CANCER_PROCEDURES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastCancerProceduresCodeP(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Procedures Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerProceduresCodeP(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_CANCER_PROCEDURES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerProcedures The receiving '<em><b>Breast Cancer Procedures</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastCancerProceduresCodeP(BreastCancerProcedures breastCancerProcedures,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_CANCER_PROCEDURES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerProcedures());
			try {
				VALIDATE_BREAST_CANCER_PROCEDURES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BREAST_CANCER_PROCEDURES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_CANCER_PROCEDURES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerProcedures)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_PROCEDURES__BREAST_CANCER_PROCEDURES_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerProceduresBreastCancerProceduresCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerProcedures, context) }),
						new Object[] { breastCancerProcedures }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastCancerProceduresCode(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Procedures Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerProceduresCode(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_CANCER_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastCancerProceduresCode(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Procedures Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerProceduresCode(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_CANCER_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerProcedures The receiving '<em><b>Breast Cancer Procedures</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastCancerProceduresCode(BreastCancerProcedures breastCancerProcedures,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_CANCER_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerProcedures());
			try {
				VALIDATE_BREAST_CANCER_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BREAST_CANCER_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_CANCER_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerProcedures)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_PROCEDURES__BREAST_CANCER_PROCEDURES_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerProceduresBreastCancerProceduresCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerProcedures, context) }),
						new Object[] { breastCancerProcedures }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastCancerProceduresEffectiveTime(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Procedures Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerProceduresEffectiveTime(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_CANCER_PROCEDURES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastCancerProceduresEffectiveTime(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Procedures Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerProceduresEffectiveTime(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_CANCER_PROCEDURES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerProcedures The receiving '<em><b>Breast Cancer Procedures</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastCancerProceduresEffectiveTime(BreastCancerProcedures breastCancerProcedures,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BREAST_CANCER_PROCEDURES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerProcedures());
			try {
				VALIDATE_BREAST_CANCER_PROCEDURES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_CANCER_PROCEDURES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_CANCER_PROCEDURES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerProcedures)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_PROCEDURES__BREAST_CANCER_PROCEDURES_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerProceduresBreastCancerProceduresEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerProcedures, context) }),
						new Object[] { breastCancerProcedures }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureTemplateId(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureTemplateId(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureTemplateId(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureTemplateId(BreastCancerProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerProcedures The receiving '<em><b>Breast Cancer Procedures</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureTemplateId(BreastCancerProcedures breastCancerProcedures,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerProcedures());
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerProcedures)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_PROCEDURES__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerProceduresProcedureActivityProcedureTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerProcedures, context) }),
						new Object[] { breastCancerProcedures }));
			}

			return false;
		}
		return true;
	}

} // BreastCancerProceduresOperations
