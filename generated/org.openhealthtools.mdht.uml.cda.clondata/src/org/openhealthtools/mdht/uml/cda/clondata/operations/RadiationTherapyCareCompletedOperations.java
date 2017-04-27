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
import org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Radiation Therapy Care Completed</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted#validateRadiationTherapyCareCompletedCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted#validateRadiationTherapyCareCompletedCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted#validateRadiationTherapyCareCompletedEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted#validateRadiationTherapyCareCompletedNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted#validateProcedureActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadiationTherapyCareCompletedOperations extends ProcedureActivityActOperations {
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
	protected RadiationTherapyCareCompletedOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRadiationTherapyCareCompletedCodeP(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRadiationTherapyCareCompletedCodeP(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateRadiationTherapyCareCompletedCodeP(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRadiationTherapyCareCompletedCodeP(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param radiationTherapyCareCompleted The receiving '<em><b>Radiation Therapy Care Completed</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRadiationTherapyCareCompletedCodeP(
			RadiationTherapyCareCompleted radiationTherapyCareCompleted, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getRadiationTherapyCareCompleted());
			try {
				VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				radiationTherapyCareCompleted)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RADIATION_THERAPY_CARE_COMPLETED__RADIATION_THERAPY_CARE_COMPLETED_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"RadiationTherapyCareCompletedRadiationTherapyCareCompletedCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										radiationTherapyCareCompleted, context) }),
						new Object[] { radiationTherapyCareCompleted }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRadiationTherapyCareCompletedCode(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRadiationTherapyCareCompletedCode(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '385798007' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateRadiationTherapyCareCompletedCode(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRadiationTherapyCareCompletedCode(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param radiationTherapyCareCompleted The receiving '<em><b>Radiation Therapy Care Completed</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRadiationTherapyCareCompletedCode(
			RadiationTherapyCareCompleted radiationTherapyCareCompleted, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getRadiationTherapyCareCompleted());
			try {
				VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				radiationTherapyCareCompleted)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RADIATION_THERAPY_CARE_COMPLETED__RADIATION_THERAPY_CARE_COMPLETED_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"RadiationTherapyCareCompletedRadiationTherapyCareCompletedCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										radiationTherapyCareCompleted, context) }),
						new Object[] { radiationTherapyCareCompleted }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRadiationTherapyCareCompletedEffectiveTime(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRadiationTherapyCareCompletedEffectiveTime(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateRadiationTherapyCareCompletedEffectiveTime(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRadiationTherapyCareCompletedEffectiveTime(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param radiationTherapyCareCompleted The receiving '<em><b>Radiation Therapy Care Completed</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRadiationTherapyCareCompletedEffectiveTime(
			RadiationTherapyCareCompleted radiationTherapyCareCompleted, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getRadiationTherapyCareCompleted());
			try {
				VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				radiationTherapyCareCompleted)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RADIATION_THERAPY_CARE_COMPLETED__RADIATION_THERAPY_CARE_COMPLETED_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"RadiationTherapyCareCompletedRadiationTherapyCareCompletedEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										radiationTherapyCareCompleted, context) }),
						new Object[] { radiationTherapyCareCompleted }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRadiationTherapyCareCompletedNegationInd(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRadiationTherapyCareCompletedNegationInd(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateRadiationTherapyCareCompletedNegationInd(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Radiation Therapy Care Completed Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRadiationTherapyCareCompletedNegationInd(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param radiationTherapyCareCompleted The receiving '<em><b>Radiation Therapy Care Completed</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRadiationTherapyCareCompletedNegationInd(
			RadiationTherapyCareCompleted radiationTherapyCareCompleted, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getRadiationTherapyCareCompleted());
			try {
				VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RADIATION_THERAPY_CARE_COMPLETED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				radiationTherapyCareCompleted)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RADIATION_THERAPY_CARE_COMPLETED__RADIATION_THERAPY_CARE_COMPLETED_NEGATION_IND,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"RadiationTherapyCareCompletedRadiationTherapyCareCompletedNegationInd",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										radiationTherapyCareCompleted, context) }),
						new Object[] { radiationTherapyCareCompleted }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActTemplateId(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActTemplateId(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.16')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActTemplateId(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActTemplateId(RadiationTherapyCareCompleted, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param radiationTherapyCareCompleted The receiving '<em><b>Radiation Therapy Care Completed</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityActTemplateId(
			RadiationTherapyCareCompleted radiationTherapyCareCompleted, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getRadiationTherapyCareCompleted());
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				radiationTherapyCareCompleted)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RADIATION_THERAPY_CARE_COMPLETED__PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"RadiationTherapyCareCompletedProcedureActivityActTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										radiationTherapyCareCompleted, context) }),
						new Object[] { radiationTherapyCareCompleted }));
			}

			return false;
		}
		return true;
	}

} // RadiationTherapyCareCompletedOperations
