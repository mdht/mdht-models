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
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note Fluid Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection#validateOperativeNoteFluidSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection#validateOperativeNoteFluidSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection#validateOperativeNoteFluidSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection#validateOperativeNoteFluidSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection#validateOperativeNoteFluidSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperativeNoteFluidSectionOperations extends SectionOperations {
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
	protected OperativeNoteFluidSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteFluidSectionTemplateId(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionTemplateId(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.7.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteFluidSectionTemplateId(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionTemplateId(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNoteFluidSection The receiving '<em><b>Operative Note Fluid Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNoteFluidSectionTemplateId(
			OperativeNoteFluidSection operativeNoteFluidSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "OperativeNoteFluidSectionOperativeNoteFluidSectionTemplateId", "ERROR");

		if (VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE_FLUID_SECTION);
			try {
				VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				operativeNoteFluidSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE_FLUID_SECTION__OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("OperativeNoteFluidSectionOperativeNoteFluidSectionTemplateId"),
						new Object[] { operativeNoteFluidSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteFluidSectionCode(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionCode(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '10216-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteFluidSectionCode(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionCode(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNoteFluidSection The receiving '<em><b>Operative Note Fluid Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNoteFluidSectionCode(OperativeNoteFluidSection operativeNoteFluidSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "OperativeNoteFluidSectionOperativeNoteFluidSectionCode", "ERROR");

		if (VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE_FLUID_SECTION);
			try {
				VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				operativeNoteFluidSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE_FLUID_SECTION__OPERATIVE_NOTE_FLUID_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("OperativeNoteFluidSectionOperativeNoteFluidSectionCode"),
						new Object[] { operativeNoteFluidSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteFluidSectionCodeP(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionCodeP(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteFluidSectionCodeP(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionCodeP(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNoteFluidSection The receiving '<em><b>Operative Note Fluid Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNoteFluidSectionCodeP(OperativeNoteFluidSection operativeNoteFluidSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "OperativeNoteFluidSectionOperativeNoteFluidSectionCodeP", "ERROR");

		if (VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE_FLUID_SECTION);
			try {
				VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				operativeNoteFluidSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE_FLUID_SECTION__OPERATIVE_NOTE_FLUID_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("OperativeNoteFluidSectionOperativeNoteFluidSectionCodeP"),
						new Object[] { operativeNoteFluidSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteFluidSectionText(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionText(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteFluidSectionText(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionText(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNoteFluidSection The receiving '<em><b>Operative Note Fluid Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNoteFluidSectionText(OperativeNoteFluidSection operativeNoteFluidSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "OperativeNoteFluidSectionOperativeNoteFluidSectionText", "ERROR");

		if (VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE_FLUID_SECTION);
			try {
				VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				operativeNoteFluidSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE_FLUID_SECTION__OPERATIVE_NOTE_FLUID_SECTION_TEXT,
						ConsolPlugin.INSTANCE.getString("OperativeNoteFluidSectionOperativeNoteFluidSectionText"),
						new Object[] { operativeNoteFluidSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteFluidSectionTitle(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionTitle(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteFluidSectionTitle(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionTitle(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operativeNoteFluidSection The receiving '<em><b>Operative Note Fluid Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOperativeNoteFluidSectionTitle(OperativeNoteFluidSection operativeNoteFluidSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "OperativeNoteFluidSectionOperativeNoteFluidSectionTitle", "ERROR");

		if (VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE_FLUID_SECTION);
			try {
				VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				operativeNoteFluidSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OPERATIVE_NOTE_FLUID_SECTION__OPERATIVE_NOTE_FLUID_SECTION_TITLE,
						ConsolPlugin.INSTANCE.getString("OperativeNoteFluidSectionOperativeNoteFluidSectionTitle"),
						new Object[] { operativeNoteFluidSection }));
			}

			return false;
		}
		return true;
	}

} // OperativeNoteFluidSectionOperations
