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
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Visit Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection#validateReasonForVisitSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection#validateReasonForVisitSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection#validateReasonForVisitSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection#validateReasonForVisitSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection#validateReasonForVisitSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonForVisitSectionOperations extends SectionOperations {
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
	protected ReasonForVisitSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForVisitSectionTemplateId(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionTemplateId(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForVisitSectionTemplateId(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionTemplateId(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForVisitSection The receiving '<em><b>Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReasonForVisitSectionTemplateId(ReasonForVisitSection reasonForVisitSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReasonForVisitSectionReasonForVisitSectionTemplateId", "ERROR");

		if (VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REASON_FOR_VISIT_SECTION__REASON_FOR_VISIT_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ReasonForVisitSectionReasonForVisitSectionTemplateId"),
						new Object[] { reasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForVisitSectionCode(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionCode(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '29299-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForVisitSectionCode(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionCode(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForVisitSection The receiving '<em><b>Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReasonForVisitSectionCode(ReasonForVisitSection reasonForVisitSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReasonForVisitSectionReasonForVisitSectionCode", "ERROR");

		if (VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REASON_FOR_VISIT_SECTION__REASON_FOR_VISIT_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("ReasonForVisitSectionReasonForVisitSectionCode"),
						new Object[] { reasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForVisitSectionCodeP(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionCodeP(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForVisitSectionCodeP(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionCodeP(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForVisitSection The receiving '<em><b>Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReasonForVisitSectionCodeP(ReasonForVisitSection reasonForVisitSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReasonForVisitSectionReasonForVisitSectionCodeP", "ERROR");

		if (VALIDATE_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REASON_FOR_VISIT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REASON_FOR_VISIT_SECTION__REASON_FOR_VISIT_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("ReasonForVisitSectionReasonForVisitSectionCodeP"),
						new Object[] { reasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForVisitSectionText(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionText(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForVisitSectionText(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionText(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForVisitSection The receiving '<em><b>Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReasonForVisitSectionText(ReasonForVisitSection reasonForVisitSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReasonForVisitSectionReasonForVisitSectionText", "ERROR");

		if (VALIDATE_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REASON_FOR_VISIT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REASON_FOR_VISIT_SECTION__REASON_FOR_VISIT_SECTION_TEXT,
						ConsolPlugin.INSTANCE.getString("ReasonForVisitSectionReasonForVisitSectionText"),
						new Object[] { reasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForVisitSectionTitle(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionTitle(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForVisitSectionTitle(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionTitle(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForVisitSection The receiving '<em><b>Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReasonForVisitSectionTitle(ReasonForVisitSection reasonForVisitSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReasonForVisitSectionReasonForVisitSectionTitle", "ERROR");

		if (VALIDATE_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REASON_FOR_VISIT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REASON_FOR_VISIT_SECTION__REASON_FOR_VISIT_SECTION_TITLE,
						ConsolPlugin.INSTANCE.getString("ReasonForVisitSectionReasonForVisitSectionTitle"),
						new Object[] { reasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

} // ReasonForVisitSectionOperations
