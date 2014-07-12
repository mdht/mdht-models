/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#validateProceduresSectionHasProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Has Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#validateProceduresSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#validateProceduresSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#validateProceduresSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#validateProceduresSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProceduresSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceduresSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionHasProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Has Procedure Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionHasProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entry->select(e | e.act.oclIsKindOf(ccd::ProcedureActivity))->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionHasProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Has Procedure Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionHasProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProceduresSectionHasProcedureActivity(ProceduresSection proceduresSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY,
					CCDPlugin.INSTANCE.getString("ProceduresSectionHasProcedureActivity"),
					new Object[] { proceduresSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionTemplateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionTemplateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionTemplateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionTemplateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProceduresSectionTemplateId(ProceduresSection proceduresSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_TEMPLATE_ID,
					CCDPlugin.INSTANCE.getString("ProceduresSectionTemplateId"), new Object[] { proceduresSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionCode(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionCode(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '47519-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionCode(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionCode(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProceduresSectionCode(ProceduresSection proceduresSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_CODE,
					CCDPlugin.INSTANCE.getString("ProceduresSectionCode"), new Object[] { proceduresSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionTitle(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionTitle(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionTitle(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionTitle(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProceduresSectionTitle(ProceduresSection proceduresSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_TITLE,
					CCDPlugin.INSTANCE.getString("ProceduresSectionTitle"), new Object[] { proceduresSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionText(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionText(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionText(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionText(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProceduresSectionText(ProceduresSection proceduresSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_TEXT,
					CCDPlugin.INSTANCE.getString("ProceduresSectionText"), new Object[] { proceduresSection }));
			}

			return false;
		}
		return true;
	}

} // ProceduresSectionOperations
