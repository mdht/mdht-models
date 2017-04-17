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
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareActivityReconstructionProcedure;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareRadiationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planof Care Section BCTPS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PlanofCareSectionBCTPS#getChemotherapyRegimenPlans() <em>Get Chemotherapy Regimen Plans</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PlanofCareSectionBCTPS#getPlanofCareActivityReconstructionProcedure() <em>Get Planof Care Activity Reconstruction Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PlanofCareSectionBCTPS#getPlanofCareRadiationActivity() <em>Get Planof Care Radiation Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.PlanofCareSectionBCTPS#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanofCareSectionBCTPSOperations extends PlanOfCareSectionOperations {
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
	protected PlanofCareSectionBCTPSOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #getChemotherapyRegimenPlans(PlanofCareSectionBCTPS) <em>Get Chemotherapy Regimen Plans</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapyRegimenPlans(PlanofCareSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHEMOTHERAPY_REGIMEN_PLANS__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(clondata::ChemotherapyRegimenPlans))->asSequence()->any(true).oclAsType(clondata::ChemotherapyRegimenPlans)";

	/**
	 * The cached OCL query for the '{@link #getChemotherapyRegimenPlans(PlanofCareSectionBCTPS) <em>Get Chemotherapy Regimen Plans</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapyRegimenPlans(PlanofCareSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHEMOTHERAPY_REGIMEN_PLANS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ChemotherapyRegimenPlans getChemotherapyRegimenPlans(PlanofCareSectionBCTPS planofCareSectionBCTPS) {

		if (GET_CHEMOTHERAPY_REGIMEN_PLANS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getPlanofCareSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getPlanofCareSectionBCTPS().getEAllOperations().get(74));
			try {
				GET_CHEMOTHERAPY_REGIMEN_PLANS__EOCL_QRY = helper.createQuery(GET_CHEMOTHERAPY_REGIMEN_PLANS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CHEMOTHERAPY_REGIMEN_PLANS__EOCL_QRY);
		return (ChemotherapyRegimenPlans) query.evaluate(planofCareSectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanofCareActivityReconstructionProcedure(PlanofCareSectionBCTPS) <em>Get Planof Care Activity Reconstruction Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanofCareActivityReconstructionProcedure(PlanofCareSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(clondata::PlanofCareActivityReconstructionProcedure))->asSequence()->any(true).oclAsType(clondata::PlanofCareActivityReconstructionProcedure)";

	/**
	 * The cached OCL query for the '{@link #getPlanofCareActivityReconstructionProcedure(PlanofCareSectionBCTPS) <em>Get Planof Care Activity Reconstruction Procedure</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanofCareActivityReconstructionProcedure(PlanofCareSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanofCareActivityReconstructionProcedure getPlanofCareActivityReconstructionProcedure(
			PlanofCareSectionBCTPS planofCareSectionBCTPS) {

		if (GET_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getPlanofCareSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getPlanofCareSectionBCTPS().getEAllOperations().get(75));
			try {
				GET_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__EOCL_QRY = helper.createQuery(
					GET_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__EOCL_QRY);
		return (PlanofCareActivityReconstructionProcedure) query.evaluate(planofCareSectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanofCareRadiationActivity(PlanofCareSectionBCTPS) <em>Get Planof Care Radiation Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanofCareRadiationActivity(PlanofCareSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANOF_CARE_RADIATION_ACTIVITY__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::PlanofCareRadiationActivity))->asSequence()->any(true).oclAsType(clondata::PlanofCareRadiationActivity)";

	/**
	 * The cached OCL query for the '{@link #getPlanofCareRadiationActivity(PlanofCareSectionBCTPS) <em>Get Planof Care Radiation Activity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanofCareRadiationActivity(PlanofCareSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANOF_CARE_RADIATION_ACTIVITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanofCareRadiationActivity getPlanofCareRadiationActivity(
			PlanofCareSectionBCTPS planofCareSectionBCTPS) {

		if (GET_PLANOF_CARE_RADIATION_ACTIVITY__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getPlanofCareSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getPlanofCareSectionBCTPS().getEAllOperations().get(76));
			try {
				GET_PLANOF_CARE_RADIATION_ACTIVITY__EOCL_QRY = helper.createQuery(
					GET_PLANOF_CARE_RADIATION_ACTIVITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLANOF_CARE_RADIATION_ACTIVITY__EOCL_QRY);
		return (PlanofCareRadiationActivity) query.evaluate(planofCareSectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionTemplateId(PlanofCareSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionTemplateId(PlanofCareSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.2.6')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionTemplateId(PlanofCareSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionTemplateId(PlanofCareSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planofCareSectionBCTPS The receiving '<em><b>Planof Care Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionTemplateId(PlanofCareSectionBCTPS planofCareSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getPlanofCareSectionBCTPS());
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planofCareSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PLANOF_CARE_SECTION_BCTPS__PLAN_OF_CARE_SECTION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"PlanofCareSectionBCTPSPlanOfCareSectionTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										planofCareSectionBCTPS, context) }),
						new Object[] { planofCareSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

} // PlanofCareSectionBCTPSOperations
