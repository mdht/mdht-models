/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

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
import org.openhealthtools.mdht.uml.cda.cdt.operations.PhysicalExaminationSectionOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection#validateHITSPPhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Physical Exam Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection#validateHITSPPhysicalExamSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Physical Exam Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection#getConditions() <em>Get Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalExamSectionOperations extends PhysicalExaminationSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalExamSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPPhysicalExamSectionTemplateId(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Physical Exam Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPPhysicalExamSectionTemplateId(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.118')";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPPhysicalExamSectionTemplateId(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Physical Exam Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPPhysicalExamSectionTemplateId(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.118')
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHITSPPhysicalExamSectionTemplateId(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.PHYSICAL_EXAM_SECTION__HITSP_PHYSICAL_EXAM_SECTION_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("HITSPPhysicalExamSectionTemplateId"),
					new Object[] { physicalExamSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPPhysicalExamSectionCondition(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Physical Exam Section Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPPhysicalExamSectionCondition(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hitsp::Condition))";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPPhysicalExamSectionCondition(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Physical Exam Section Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPPhysicalExamSectionCondition(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hitsp::Condition))
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHITSPPhysicalExamSectionCondition(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.PHYSICAL_EXAM_SECTION__HITSP_PHYSICAL_EXAM_SECTION_CONDITION,
					HITSPPlugin.INSTANCE.getString("HITSPPhysicalExamSectionCondition"),
					new Object[] { physicalExamSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConditions(PhysicalExamSection) <em>Get Conditions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONDITIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hitsp::Condition)).oclAsType(hitsp::Condition)";

	/**
	 * The cached OCL query for the '{@link #getConditions(PhysicalExamSection) <em>Get Conditions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONDITIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hitsp::Condition)).oclAsType(hitsp::Condition)
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Condition> getConditions(PhysicalExamSection physicalExamSection) {
		if (GET_CONDITIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.PHYSICAL_EXAM_SECTION,
				HITSPPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(112));
			try {
				GET_CONDITIONS__EOCL_QRY = helper.createQuery(GET_CONDITIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONDITIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Condition> result = (Collection<Condition>) query.evaluate(physicalExamSection);
		return new BasicEList.UnmodifiableEList<Condition>(result.size(), result.toArray());
	}

} // PhysicalExamSectionOperations
