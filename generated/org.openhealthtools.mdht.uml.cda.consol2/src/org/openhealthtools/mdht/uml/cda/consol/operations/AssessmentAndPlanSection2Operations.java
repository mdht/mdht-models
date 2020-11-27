/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment And Plan Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2#validateAssessmentAndPlanSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2#getConsolPlannedAct2s() <em>Get Consol Planned Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2#validateAssessmentAndPlanSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2#validateAssessmentAndPlanSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2#validateAssessmentAndPlanSectionPlanOfCareActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Plan Of Care Activity Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentAndPlanSection2Operations extends AssessmentAndPlanSectionOperations {
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
	protected AssessmentAndPlanSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSection2TemplateId(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSection2TemplateId(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.9' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSection2TemplateId(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSection2TemplateId(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_AND_PLAN_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentAndPlanSection2 The receiving '<em><b>Assessment And Plan Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentAndPlanSection2TemplateId(
			AssessmentAndPlanSection2 assessmentAndPlanSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentAndPlanSection2AssessmentAndPlanSection2TemplateId", "ERROR");

		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION2);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_AND_PLAN_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_AND_PLAN_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentAndPlanSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_AND_PLAN_SECTION2__ASSESSMENT_AND_PLAN_SECTION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSection2AssessmentAndPlanSection2TemplateId"),
						new Object[] { assessmentAndPlanSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPlannedAct2s(AssessmentAndPlanSection2) <em>Get Consol Planned Act2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedAct2s(AssessmentAndPlanSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PLANNED_ACT2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedAct2)).oclAsType(consol::PlannedAct2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPlannedAct2s(AssessmentAndPlanSection2) <em>Get Consol Planned Act2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPlannedAct2s(AssessmentAndPlanSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PLANNED_ACT2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedAct2> getConsolPlannedAct2s(AssessmentAndPlanSection2 assessmentAndPlanSection2) {

		if (GET_CONSOL_PLANNED_ACT2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION2,
				ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION2.getEAllOperations().get(62));
			try {
				GET_CONSOL_PLANNED_ACT2S__EOCL_QRY = helper.createQuery(GET_CONSOL_PLANNED_ACT2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PLANNED_ACT2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedAct2> result = (Collection<PlannedAct2>) query.evaluate(assessmentAndPlanSection2);
		return new BasicEList.UnmodifiableEList<PlannedAct2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionCodeP(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionCodeP(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionCodeP(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionCodeP(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentAndPlanSection2 The receiving '<em><b>Assessment And Plan Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentAndPlanSectionCodeP(AssessmentAndPlanSection2 assessmentAndPlanSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentAndPlanSection2AssessmentAndPlanSectionCodeP", "ERROR");

		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION2);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentAndPlanSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_AND_PLAN_SECTION2__ASSESSMENT_AND_PLAN_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSection2AssessmentAndPlanSectionCodeP"),
						new Object[] { assessmentAndPlanSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSectionCodeP", passToken);
				}
				passToken.add(assessmentAndPlanSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '51847-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentAndPlanSection2 The receiving '<em><b>Assessment And Plan Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection2 assessmentAndPlanSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(assessmentAndPlanSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "AssessmentAndPlanSection2AssessmentAndPlanSectionCode", "ERROR");

		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION2);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentAndPlanSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_AND_PLAN_SECTION2__ASSESSMENT_AND_PLAN_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSection2AssessmentAndPlanSectionCode"),
						new Object[] { assessmentAndPlanSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionPlanOfCareActivityAct(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Plan Of Care Activity Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionPlanOfCareActivityAct(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PlannedAct2))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionPlanOfCareActivityAct(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Plan Of Care Activity Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionPlanOfCareActivityAct(AssessmentAndPlanSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentAndPlanSection2 The receiving '<em><b>Assessment And Plan Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentAndPlanSectionPlanOfCareActivityAct(
			AssessmentAndPlanSection2 assessmentAndPlanSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentAndPlanSection2AssessmentAndPlanSectionPlanOfCareActivityAct", "INFO");

		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION2);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentAndPlanSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_AND_PLAN_SECTION2__ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentAndPlanSection2AssessmentAndPlanSectionPlanOfCareActivityAct"),
						new Object[] { assessmentAndPlanSection2 }));
			}

			return false;
		}
		return true;
	}

} // AssessmentAndPlanSection2Operations
