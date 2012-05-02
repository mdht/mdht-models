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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Procedure Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#validatePlannedProcedureSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#validatePlannedProcedureSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#validatePlannedProcedureSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#validatePlannedProcedureSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#validatePlannedProcedureSectionPlanOfCareActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#getPlanOfCareActivityProcedures() <em>Get Plan Of Care Activity Procedures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedProcedureSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedProcedureSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedureSectionTemplateId(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureSectionTemplateId(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.30')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedureSectionTemplateId(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureSectionTemplateId(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLANNED_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.30')
	 * @param plannedProcedureSection The receiving '<em><b>Planned Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlannedProcedureSectionTemplateId(PlannedProcedureSection plannedProcedureSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE_SECTION);
			try {
				VALIDATE_PLANNED_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE_SECTION__PLANNED_PROCEDURE_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PlannedProcedureSectionTemplateId"),
					new Object[] { plannedProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedureSectionCode(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureSectionCode(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '59772-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedureSectionCode(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureSectionCode(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLANNED_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '59772-4' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param plannedProcedureSection The receiving '<em><b>Planned Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlannedProcedureSectionCode(PlannedProcedureSection plannedProcedureSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE_SECTION);
			try {
				VALIDATE_PLANNED_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE_SECTION__PLANNED_PROCEDURE_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("PlannedProcedureSectionCode"),
					new Object[] { plannedProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedureSectionText(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureSectionText(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedureSectionText(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureSectionText(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLANNED_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param plannedProcedureSection The receiving '<em><b>Planned Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlannedProcedureSectionText(PlannedProcedureSection plannedProcedureSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE_SECTION);
			try {
				VALIDATE_PLANNED_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE_SECTION__PLANNED_PROCEDURE_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("PlannedProcedureSectionText"),
					new Object[] { plannedProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedureSectionTitle(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureSectionTitle(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedureSectionTitle(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureSectionTitle(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLANNED_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param plannedProcedureSection The receiving '<em><b>Planned Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlannedProcedureSectionTitle(PlannedProcedureSection plannedProcedureSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE_SECTION);
			try {
				VALIDATE_PLANNED_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE_SECTION__PLANNED_PROCEDURE_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("PlannedProcedureSectionTitle"),
					new Object[] { plannedProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedureSectionPlanOfCareActivityProcedure(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Plan Of Care Activity Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureSectionPlanOfCareActivityProcedure(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedureSectionPlanOfCareActivityProcedure(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Plan Of Care Activity Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedureSectionPlanOfCareActivityProcedure(PlannedProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLANNED_PROCEDURE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure))
	 * @param plannedProcedureSection The receiving '<em><b>Planned Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlannedProcedureSectionPlanOfCareActivityProcedure(
			PlannedProcedureSection plannedProcedureSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE_SECTION);
			try {
				VALIDATE_PLANNED_PROCEDURE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_PROCEDURE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE_SECTION__PLANNED_PROCEDURE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE,
					ConsolPlugin.INSTANCE.getString("PlannedProcedureSectionPlanOfCareActivityProcedure"),
					new Object[] { plannedProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivityProcedures(PlannedProcedureSection) <em>Get Plan Of Care Activity Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityProcedures(PlannedProcedureSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure)).oclAsType(consol::PlanOfCareActivityProcedure)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivityProcedures(PlannedProcedureSection) <em>Get Plan Of Care Activity Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityProcedures(PlannedProcedureSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure)).oclAsType(consol::PlanOfCareActivityProcedure)
	 * @param plannedProcedureSection The receiving '<em><b>Planned Procedure Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<PlanOfCareActivityProcedure> getPlanOfCareActivityProcedures(
			PlannedProcedureSection plannedProcedureSection) {
		if (GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_PROCEDURE_SECTION,
				ConsolPackage.Literals.PLANNED_PROCEDURE_SECTION.getEAllOperations().get(60));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlanOfCareActivityProcedure> result = (Collection<PlanOfCareActivityProcedure>) query.evaluate(plannedProcedureSection);
		return new BasicEList.UnmodifiableEList<PlanOfCareActivityProcedure>(result.size(), result.toArray());
	}

} // PlannedProcedureSectionOperations
