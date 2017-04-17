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
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareActivityReconstructionProcedure;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivityProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planof Care Activity Reconstruction Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PlanofCareActivityReconstructionProcedure#validatePlanofCareActivityReconstructionProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planof Care Activity Reconstruction Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PlanofCareActivityReconstructionProcedure#validatePlanofCareActivityReconstructionProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planof Care Activity Reconstruction Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PlanofCareActivityReconstructionProcedure#validatePlanOfCareActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanofCareActivityReconstructionProcedureOperations extends PlanOfCareActivityProcedureOperations {
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
	protected PlanofCareActivityReconstructionProcedureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanofCareActivityReconstructionProcedureCode(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planof Care Activity Reconstruction Procedure Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanofCareActivityReconstructionProcedureCode(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanofCareActivityReconstructionProcedureCode(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planof Care Activity Reconstruction Procedure Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanofCareActivityReconstructionProcedureCode(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planofCareActivityReconstructionProcedure The receiving '<em><b>Planof Care Activity Reconstruction Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanofCareActivityReconstructionProcedureCode(
			PlanofCareActivityReconstructionProcedure planofCareActivityReconstructionProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPlanofCareActivityReconstructionProcedure());
			try {
				VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planofCareActivityReconstructionProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PlanofCareActivityReconstructionProcedurePlanofCareActivityReconstructionProcedureCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										planofCareActivityReconstructionProcedure, context) }),
						new Object[] { planofCareActivityReconstructionProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanofCareActivityReconstructionProcedureEffectiveTime(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planof Care Activity Reconstruction Procedure Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanofCareActivityReconstructionProcedureEffectiveTime(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanofCareActivityReconstructionProcedureEffectiveTime(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planof Care Activity Reconstruction Procedure Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanofCareActivityReconstructionProcedureEffectiveTime(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planofCareActivityReconstructionProcedure The receiving '<em><b>Planof Care Activity Reconstruction Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanofCareActivityReconstructionProcedureEffectiveTime(
			PlanofCareActivityReconstructionProcedure planofCareActivityReconstructionProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPlanofCareActivityReconstructionProcedure());
			try {
				VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planofCareActivityReconstructionProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PlanofCareActivityReconstructionProcedurePlanofCareActivityReconstructionProcedureEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										planofCareActivityReconstructionProcedure, context) }),
						new Object[] { planofCareActivityReconstructionProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityProcedureTemplateId(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityProcedureTemplateId(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.31')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityProcedureTemplateId(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityProcedureTemplateId(PlanofCareActivityReconstructionProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planofCareActivityReconstructionProcedure The receiving '<em><b>Planof Care Activity Reconstruction Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivityProcedureTemplateId(
			PlanofCareActivityReconstructionProcedure planofCareActivityReconstructionProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPlanofCareActivityReconstructionProcedure());
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planofCareActivityReconstructionProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PlanofCareActivityReconstructionProcedurePlanOfCareActivityProcedureTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										planofCareActivityReconstructionProcedure, context) }),
						new Object[] { planofCareActivityReconstructionProcedure }));
			}

			return false;
		}
		return true;
	}

} // PlanofCareActivityReconstructionProcedureOperations
