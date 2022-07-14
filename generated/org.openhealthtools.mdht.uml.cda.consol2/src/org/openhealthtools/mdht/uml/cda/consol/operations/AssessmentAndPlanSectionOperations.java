/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment And Plan Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionPlanOfCareActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Plan Of Care Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#getPlanOfCareActivityActs() <em>Get Plan Of Care Activity Acts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentAndPlanSectionOperations extends SectionOperations {
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
	protected AssessmentAndPlanSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection assessmentAndPlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentAndPlanSectionAssessmentAndPlanSectionTemplateId", "ERROR");

		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSectionAssessmentAndPlanSectionTemplateId"),
						new Object[] { assessmentAndPlanSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '51847-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection assessmentAndPlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentAndPlanSectionAssessmentAndPlanSectionCode", "ERROR");

		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSectionAssessmentAndPlanSectionCode"),
						new Object[] { assessmentAndPlanSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionCodeP(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionCodeP(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionCodeP(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionCodeP(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentAndPlanSectionCodeP(AssessmentAndPlanSection assessmentAndPlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentAndPlanSectionAssessmentAndPlanSectionCodeP", "ERROR");

		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
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
				assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSectionAssessmentAndPlanSectionCodeP"),
						new Object[] { assessmentAndPlanSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionText(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionText(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionText(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionText(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentAndPlanSectionText(AssessmentAndPlanSection assessmentAndPlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AssessmentAndPlanSectionAssessmentAndPlanSectionText", "ERROR");

		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_TEXT,
						ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSectionAssessmentAndPlanSectionText"),
						new Object[] { assessmentAndPlanSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionPlanOfCareActivityAct(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Plan Of Care Activity Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionPlanOfCareActivityAct(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PlanOfCareActivityAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionPlanOfCareActivityAct(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Plan Of Care Activity Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionPlanOfCareActivityAct(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentAndPlanSectionPlanOfCareActivityAct(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AssessmentAndPlanSectionAssessmentAndPlanSectionPlanOfCareActivityAct", "INFO");

		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
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
				assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_PLAN_OF_CARE_ACTIVITY_ACT,
						ConsolPlugin.INSTANCE.getString(
							"AssessmentAndPlanSectionAssessmentAndPlanSectionPlanOfCareActivityAct"),
						new Object[] { assessmentAndPlanSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivityActs(AssessmentAndPlanSection) <em>Get Plan Of Care Activity Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityActs(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlanOfCareActivityAct)).oclAsType(consol::PlanOfCareActivityAct)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivityActs(AssessmentAndPlanSection) <em>Get Plan Of Care Activity Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityActs(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlanOfCareActivityAct> getPlanOfCareActivityActs(
			AssessmentAndPlanSection assessmentAndPlanSection) {

		if (GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION,
				ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(60));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlanOfCareActivityAct> result = (Collection<PlanOfCareActivityAct>) query.evaluate(
			assessmentAndPlanSection);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

} // AssessmentAndPlanSectionOperations
