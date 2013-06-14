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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chief Complaint And Reason For Visit Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection#validateChiefComplaintAndReasonForVisitSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection#validateChiefComplaintAndReasonForVisitSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection#validateChiefComplaintAndReasonForVisitSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection#validateChiefComplaintAndReasonForVisitSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection#validateChiefComplaintAndReasonForVisitSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChiefComplaintAndReasonForVisitSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChiefComplaintAndReasonForVisitSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintAndReasonForVisitSectionTemplateId(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintAndReasonForVisitSectionTemplateId(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintAndReasonForVisitSectionTemplateId(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintAndReasonForVisitSectionTemplateId(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.13')
	 * @param chiefComplaintAndReasonForVisitSection The receiving '<em><b>Chief Complaint And Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChiefComplaintAndReasonForVisitSectionTemplateId(
			ChiefComplaintAndReasonForVisitSection chiefComplaintAndReasonForVisitSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			chiefComplaintAndReasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ChiefComplaintAndReasonForVisitSectionTemplateId"),
					new Object[] { chiefComplaintAndReasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintAndReasonForVisitSectionCode(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintAndReasonForVisitSectionCode(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '46239-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintAndReasonForVisitSectionCode(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintAndReasonForVisitSectionCode(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '46239-0' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param chiefComplaintAndReasonForVisitSection The receiving '<em><b>Chief Complaint And Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChiefComplaintAndReasonForVisitSectionCode(
			ChiefComplaintAndReasonForVisitSection chiefComplaintAndReasonForVisitSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			chiefComplaintAndReasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("ChiefComplaintAndReasonForVisitSectionCode"),
					new Object[] { chiefComplaintAndReasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintAndReasonForVisitSectionCodeP(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintAndReasonForVisitSectionCodeP(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintAndReasonForVisitSectionCodeP(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintAndReasonForVisitSectionCodeP(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param chiefComplaintAndReasonForVisitSection The receiving '<em><b>Chief Complaint And Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChiefComplaintAndReasonForVisitSectionCodeP(
			ChiefComplaintAndReasonForVisitSection chiefComplaintAndReasonForVisitSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			chiefComplaintAndReasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_CODE_P,
					ConsolPlugin.INSTANCE.getString("ChiefComplaintAndReasonForVisitSectionCodeP"),
					new Object[] { chiefComplaintAndReasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintAndReasonForVisitSectionText(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintAndReasonForVisitSectionText(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintAndReasonForVisitSectionText(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintAndReasonForVisitSectionText(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param chiefComplaintAndReasonForVisitSection The receiving '<em><b>Chief Complaint And Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChiefComplaintAndReasonForVisitSectionText(
			ChiefComplaintAndReasonForVisitSection chiefComplaintAndReasonForVisitSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			chiefComplaintAndReasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("ChiefComplaintAndReasonForVisitSectionText"),
					new Object[] { chiefComplaintAndReasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintAndReasonForVisitSectionTitle(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintAndReasonForVisitSectionTitle(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintAndReasonForVisitSectionTitle(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint And Reason For Visit Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintAndReasonForVisitSectionTitle(ChiefComplaintAndReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param chiefComplaintAndReasonForVisitSection The receiving '<em><b>Chief Complaint And Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChiefComplaintAndReasonForVisitSectionTitle(
			ChiefComplaintAndReasonForVisitSection chiefComplaintAndReasonForVisitSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			chiefComplaintAndReasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("ChiefComplaintAndReasonForVisitSectionTitle"),
					new Object[] { chiefComplaintAndReasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

} // ChiefComplaintAndReasonForVisitSectionOperations
