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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Act2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2CodeFromLoincOrSnomed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Code From Loinc Or Snomed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlannedAct2PriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#getPriorityPreferences() <em>Get Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2#validatePlanOfCareActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedAct2Operations extends PlanOfCareActivityActOperations {
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
	protected PlannedAct2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedAct2CodeFromLoincOrSnomed(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Code From Loinc Or Snomed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2CodeFromLoincOrSnomed(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_ACT2_CODE_FROM_LOINC_OR_SNOMED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not code.oclIsUndefined() and code.isNullFlavorUndefined()) implies (code.codeSystem = '2.16.840.1.113883.6.1' or code.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedAct2CodeFromLoincOrSnomed(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Code From Loinc Or Snomed</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2CodeFromLoincOrSnomed(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_ACT2_CODE_FROM_LOINC_OR_SNOMED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedAct2CodeFromLoincOrSnomed(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlannedAct2CodeFromLoincOrSnomed", "WARNING");

		if (VALIDATE_PLANNED_ACT2_CODE_FROM_LOINC_OR_SNOMED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLANNED_ACT2_CODE_FROM_LOINC_OR_SNOMED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_ACT2_CODE_FROM_LOINC_OR_SNOMED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_ACT2_CODE_FROM_LOINC_OR_SNOMED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLANNED_ACT2_CODE_FROM_LOINC_OR_SNOMED,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlannedAct2CodeFromLoincOrSnomed"),
						new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedAct2TemplateId(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2TemplateId(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.39' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedAct2TemplateId(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2TemplateId(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedAct2TemplateId(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlannedAct2TemplateId", "ERROR");

		if (VALIDATE_PLANNED_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLANNED_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLANNED_ACT2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlannedAct2TemplateId"),
						new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedAct2Code(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2Code(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_ACT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedAct2Code(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2Code(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_ACT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedAct2Code(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlannedAct2Code", "ERROR");

		if (VALIDATE_PLANNED_ACT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLANNED_ACT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_ACT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_ACT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLANNED_ACT2_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlannedAct2Code"), new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedAct2StatusCode(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2StatusCode(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_ACT2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedAct2StatusCode(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2StatusCode(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_ACT2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedAct2StatusCode(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlannedAct2StatusCode", "ERROR");

		if (VALIDATE_PLANNED_ACT2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLANNED_ACT2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_ACT2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_ACT2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLANNED_ACT2_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlannedAct2StatusCode"),
						new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedAct2StatusCodeP(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2StatusCodeP(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_ACT2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedAct2StatusCodeP(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2StatusCodeP(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_ACT2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedAct2StatusCodeP(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlannedAct2StatusCodeP", "ERROR");

		if (VALIDATE_PLANNED_ACT2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLANNED_ACT2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_ACT2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_ACT2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLANNED_ACT2_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlannedAct2StatusCodeP"),
						new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedAct2EffectiveTime(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2EffectiveTime(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_ACT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedAct2EffectiveTime(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2EffectiveTime(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_ACT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedAct2EffectiveTime(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlannedAct2EffectiveTime", "WARNING");

		if (VALIDATE_PLANNED_ACT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLANNED_ACT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_ACT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_ACT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLANNED_ACT2_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlannedAct2EffectiveTime"),
						new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedAct2Indication2(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Indication2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2Indication2(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_ACT2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedAct2Indication2(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Indication2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2Indication2(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_ACT2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedAct2Indication2(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlannedAct2Indication2", "INFO");

		if (VALIDATE_PLANNED_ACT2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLANNED_ACT2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_ACT2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_ACT2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLANNED_ACT2_INDICATION2,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlannedAct2Indication2"),
						new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedAct2Instruction2(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2Instruction2(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_ACT2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedAct2Instruction2(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2Instruction2(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_ACT2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedAct2Instruction2(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlannedAct2Instruction2", "INFO");

		if (VALIDATE_PLANNED_ACT2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLANNED_ACT2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_ACT2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_ACT2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLANNED_ACT2_INSTRUCTION2,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlannedAct2Instruction2"),
						new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedAct2AuthorParticipation(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2AuthorParticipation(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedAct2AuthorParticipation(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2AuthorParticipation(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedAct2AuthorParticipation(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlannedAct2AuthorParticipation", "WARNING");

		if (VALIDATE_PLANNED_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLANNED_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLANNED_ACT2_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlannedAct2AuthorParticipation"),
						new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedAct2Performer(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2Performer(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_ACT2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedAct2Performer(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2Performer(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_ACT2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedAct2Performer(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlannedAct2Performer", "INFO");

		if (VALIDATE_PLANNED_ACT2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLANNED_ACT2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_ACT2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_ACT2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLANNED_ACT2_PERFORMER,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlannedAct2Performer"),
						new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedAct2PriorityPreference(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2PriorityPreference(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedAct2PriorityPreference(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Act2 Priority Preference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedAct2PriorityPreference(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedAct2PriorityPreference(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlannedAct2PriorityPreference", "INFO");

		if (VALIDATE_PLANNED_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLANNED_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLANNED_ACT2_PRIORITY_PREFERENCE,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlannedAct2PriorityPreference"),
						new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndication2s(PlannedAct2) <em>Get Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PlannedAct2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getIndication2s(PlannedAct2) <em>Get Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PlannedAct2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getIndication2s(PlannedAct2 plannedAct2) {

		if (GET_INDICATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_ACT2, ConsolPackage.Literals.PLANNED_ACT2.getEAllOperations().get(66));
			try {
				GET_INDICATION2S__EOCL_QRY = helper.createQuery(GET_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(plannedAct2);
		return new BasicEList.UnmodifiableEList<Indication2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstruction2s(PlannedAct2) <em>Get Instruction2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedAct2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTION2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getInstruction2s(PlannedAct2) <em>Get Instruction2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedAct2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Instruction2> getInstruction2s(PlannedAct2 plannedAct2) {

		if (GET_INSTRUCTION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_ACT2, ConsolPackage.Literals.PLANNED_ACT2.getEAllOperations().get(67));
			try {
				GET_INSTRUCTION2S__EOCL_QRY = helper.createQuery(GET_INSTRUCTION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INSTRUCTION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instruction2> result = (Collection<Instruction2>) query.evaluate(plannedAct2);
		return new BasicEList.UnmodifiableEList<Instruction2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPriorityPreferences(PlannedAct2) <em>Get Priority Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(PlannedAct2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIORITY_PREFERENCES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)).oclAsType(consol::PriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getPriorityPreferences(PlannedAct2) <em>Get Priority Preferences</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(PlannedAct2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIORITY_PREFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PriorityPreference> getPriorityPreferences(PlannedAct2 plannedAct2) {

		if (GET_PRIORITY_PREFERENCES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_ACT2, ConsolPackage.Literals.PLANNED_ACT2.getEAllOperations().get(68));
			try {
				GET_PRIORITY_PREFERENCES__EOCL_QRY = helper.createQuery(GET_PRIORITY_PREFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PRIORITY_PREFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PriorityPreference> result = (Collection<PriorityPreference>) query.evaluate(plannedAct2);
		return new BasicEList.UnmodifiableEList<PriorityPreference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityActMoodCode(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityActMoodCode(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentActMood) and " +
			"let value : vocab::x_DocumentActMood = self.moodCode.oclAsType(vocab::x_DocumentActMood) in " +
			"value = vocab::x_DocumentActMood::INT or value = vocab::x_DocumentActMood::ARQ or value = vocab::x_DocumentActMood::PRMS or value = vocab::x_DocumentActMood::PRP or value = vocab::x_DocumentActMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityActMoodCode(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityActMoodCode(PlannedAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedAct2 The receiving '<em><b>Planned Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivityActMoodCode(PlannedAct2 plannedAct2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedAct2PlanOfCareActivityActMoodCode", "ERROR");

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_ACT2);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_ACT2__PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedAct2PlanOfCareActivityActMoodCode"),
						new Object[] { plannedAct2 }));
			}

			return false;
		}
		return true;
	}

} // PlannedAct2Operations
