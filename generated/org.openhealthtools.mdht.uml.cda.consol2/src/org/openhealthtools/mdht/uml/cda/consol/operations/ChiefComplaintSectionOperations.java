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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chief Complaint Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#validateChiefComplaintSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#validateChiefComplaintSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#validateChiefComplaintSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#validateChiefComplaintSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#validateChiefComplaintSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChiefComplaintSectionOperations extends SectionOperations {
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
	protected ChiefComplaintSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.13.2.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chiefComplaintSection The receiving '<em><b>Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChiefComplaintSectionTemplateId(ChiefComplaintSection chiefComplaintSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ChiefComplaintSectionChiefComplaintSectionTemplateId"),
						new Object[] { chiefComplaintSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintSectionCode(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionCode(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '10154-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintSectionCode(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionCode(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chiefComplaintSection The receiving '<em><b>Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChiefComplaintSectionCode(ChiefComplaintSection chiefComplaintSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(chiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("ChiefComplaintSectionChiefComplaintSectionCode"),
						new Object[] { chiefComplaintSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintSectionCodeP(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionCodeP(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintSectionCodeP(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionCodeP(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHIEF_COMPLAINT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chiefComplaintSection The receiving '<em><b>Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChiefComplaintSectionCodeP(ChiefComplaintSection chiefComplaintSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHIEF_COMPLAINT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHIEF_COMPLAINT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("ChiefComplaintSectionChiefComplaintSectionCodeP"),
						new Object[] { chiefComplaintSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintSectionText(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionText(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintSectionText(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionText(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHIEF_COMPLAINT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chiefComplaintSection The receiving '<em><b>Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChiefComplaintSectionText(ChiefComplaintSection chiefComplaintSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHIEF_COMPLAINT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHIEF_COMPLAINT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(chiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_TEXT,
						ConsolPlugin.INSTANCE.getString("ChiefComplaintSectionChiefComplaintSectionText"),
						new Object[] { chiefComplaintSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintSectionTitle(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionTitle(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintSectionTitle(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionTitle(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHIEF_COMPLAINT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chiefComplaintSection The receiving '<em><b>Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChiefComplaintSectionTitle(ChiefComplaintSection chiefComplaintSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHIEF_COMPLAINT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHIEF_COMPLAINT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_TITLE,
						ConsolPlugin.INSTANCE.getString("ChiefComplaintSectionChiefComplaintSectionTitle"),
						new Object[] { chiefComplaintSection }));
			}

			return false;
		}
		return true;
	}

} // ChiefComplaintSectionOperations
