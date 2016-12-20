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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivitySupply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityActs() <em>Get Plan Of Care Activity Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityEncounters() <em>Get Plan Of Care Activity Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityObservations() <em>Get Plan Of Care Activity Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityProcedures() <em>Get Plan Of Care Activity Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivitySubstanceAdministrations() <em>Get Plan Of Care Activity Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivitySupplies() <em>Get Plan Of Care Activity Supplies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getInstructionss() <em>Get Instructionss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfCareSectionOperations extends SectionOperations {
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
	protected PlanOfCareSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.10')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionTemplateId(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareSectionTemplateId"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionCode(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCode(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '18776-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionCode(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCode(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionCode(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareSectionCode"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionCodeP(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCodeP(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionCodeP(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionCodeP(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionCodeP(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareSectionCodeP"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionTitle(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionTitle(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionTitle(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionTitle(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionTitle(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TITLE,
						ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareSectionTitle"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionText(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionText(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionText(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionText(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionText(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEXT,
						ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareSectionText"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PlanOfCareActivityAct))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT,
						ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareSectionPlanOfCareActivityAct"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER,
						ConsolPlugin.INSTANCE.getString(
							"PlanOfCareSectionPlanOfCareSectionPlanOfCareActivityEncounter"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PlanOfCareActivityObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"PlanOfCareSectionPlanOfCareSectionPlanOfCareActivityObservation"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE,
						ConsolPlugin.INSTANCE.getString(
							"PlanOfCareSectionPlanOfCareSectionPlanOfCareActivityProcedure"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::PlanOfCareActivitySubstanceAdministration))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION,
						ConsolPlugin.INSTANCE.getString(
							"PlanOfCareSectionPlanOfCareSectionPlanOfCareActivitySubstanceAdministration"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::PlanOfCareActivitySupply))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY,
						ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareSectionPlanOfCareActivitySupply"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareSectionInstructions(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionInstructions(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::Instructions))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareSectionInstructions(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareSectionInstructions(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareSectionInstructions(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_INSTRUCTIONS,
						ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareSectionInstructions"),
						new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivityActs(PlanOfCareSection) <em>Get Plan Of Care Activity Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityActs(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlanOfCareActivityAct)).oclAsType(consol::PlanOfCareActivityAct)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivityActs(PlanOfCareSection) <em>Get Plan Of Care Activity Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityActs(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlanOfCareActivityAct> getPlanOfCareActivityActs(PlanOfCareSection planOfCareSection) {

		if (GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(67));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_CARE_ACTIVITY_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlanOfCareActivityAct> result = (Collection<PlanOfCareActivityAct>) query.evaluate(
			planOfCareSection);
		return new BasicEList.UnmodifiableEList<PlanOfCareActivityAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivityEncounters(PlanOfCareSection) <em>Get Plan Of Care Activity Encounters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityEncounters(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter)).oclAsType(consol::PlanOfCareActivityEncounter)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivityEncounters(PlanOfCareSection) <em>Get Plan Of Care Activity Encounters</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityEncounters(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlanOfCareActivityEncounter> getPlanOfCareActivityEncounters(
			PlanOfCareSection planOfCareSection) {

		if (GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(68));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_QRY = helper.createQuery(
					GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlanOfCareActivityEncounter> result = (Collection<PlanOfCareActivityEncounter>) query.evaluate(
			planOfCareSection);
		return new BasicEList.UnmodifiableEList<PlanOfCareActivityEncounter>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivityObservations(PlanOfCareSection) <em>Get Plan Of Care Activity Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityObservations(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlanOfCareActivityObservation)).oclAsType(consol::PlanOfCareActivityObservation)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivityObservations(PlanOfCareSection) <em>Get Plan Of Care Activity Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityObservations(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlanOfCareActivityObservation> getPlanOfCareActivityObservations(
			PlanOfCareSection planOfCareSection) {

		if (GET_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(69));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_CARE_ACTIVITY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlanOfCareActivityObservation> result = (Collection<PlanOfCareActivityObservation>) query.evaluate(
			planOfCareSection);
		return new BasicEList.UnmodifiableEList<PlanOfCareActivityObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivityProcedures(PlanOfCareSection) <em>Get Plan Of Care Activity Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityProcedures(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure)).oclAsType(consol::PlanOfCareActivityProcedure)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivityProcedures(PlanOfCareSection) <em>Get Plan Of Care Activity Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityProcedures(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlanOfCareActivityProcedure> getPlanOfCareActivityProcedures(
			PlanOfCareSection planOfCareSection) {

		if (GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(70));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_QRY = helper.createQuery(
					GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlanOfCareActivityProcedure> result = (Collection<PlanOfCareActivityProcedure>) query.evaluate(
			planOfCareSection);
		return new BasicEList.UnmodifiableEList<PlanOfCareActivityProcedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivitySubstanceAdministrations(PlanOfCareSection) <em>Get Plan Of Care Activity Substance Administrations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivitySubstanceAdministrations(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlanOfCareActivitySubstanceAdministration)).oclAsType(consol::PlanOfCareActivitySubstanceAdministration)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivitySubstanceAdministrations(PlanOfCareSection) <em>Get Plan Of Care Activity Substance Administrations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivitySubstanceAdministrations(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlanOfCareActivitySubstanceAdministration> getPlanOfCareActivitySubstanceAdministrations(
			PlanOfCareSection planOfCareSection) {

		if (GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(71));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(
					GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlanOfCareActivitySubstanceAdministration> result = (Collection<PlanOfCareActivitySubstanceAdministration>) query.evaluate(
			planOfCareSection);
		return new BasicEList.UnmodifiableEList<PlanOfCareActivitySubstanceAdministration>(
			result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivitySupplies(PlanOfCareSection) <em>Get Plan Of Care Activity Supplies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivitySupplies(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUPPLIES__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlanOfCareActivitySupply)).oclAsType(consol::PlanOfCareActivitySupply)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivitySupplies(PlanOfCareSection) <em>Get Plan Of Care Activity Supplies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivitySupplies(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_SUPPLIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlanOfCareActivitySupply> getPlanOfCareActivitySupplies(PlanOfCareSection planOfCareSection) {

		if (GET_PLAN_OF_CARE_ACTIVITY_SUPPLIES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(72));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUPPLIES__EOCL_QRY = helper.createQuery(
					GET_PLAN_OF_CARE_ACTIVITY_SUPPLIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUPPLIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlanOfCareActivitySupply> result = (Collection<PlanOfCareActivitySupply>) query.evaluate(
			planOfCareSection);
		return new BasicEList.UnmodifiableEList<PlanOfCareActivitySupply>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstructionss(PlanOfCareSection) <em>Get Instructionss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionss(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTIONSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions)).oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getInstructionss(PlanOfCareSection) <em>Get Instructionss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionss(PlanOfCareSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Instructions> getInstructionss(PlanOfCareSection planOfCareSection) {

		if (GET_INSTRUCTIONSS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(73));
			try {
				GET_INSTRUCTIONSS__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INSTRUCTIONSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instructions> result = (Collection<Instructions>) query.evaluate(planOfCareSection);
		return new BasicEList.UnmodifiableEList<Instructions>(result.size(), result.toArray());
	}

} // PlanOfCareSectionOperations
