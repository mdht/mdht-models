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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Surgical Drains Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection#validateSurgicalDrainsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection#validateSurgicalDrainsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection#validateSurgicalDrainsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection#validateSurgicalDrainsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection#validateSurgicalDrainsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurgicalDrainsSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurgicalDrainsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgicalDrainsSectionTemplateId(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgicalDrainsSectionTemplateId(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGICAL_DRAINS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.7.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgicalDrainsSectionTemplateId(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgicalDrainsSectionTemplateId(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SURGICAL_DRAINS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param surgicalDrainsSection The receiving '<em><b>Surgical Drains Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSurgicalDrainsSectionTemplateId(SurgicalDrainsSection surgicalDrainsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SURGICAL_DRAINS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGICAL_DRAINS_SECTION);
			try {
				VALIDATE_SURGICAL_DRAINS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGICAL_DRAINS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGICAL_DRAINS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			surgicalDrainsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SURGICAL_DRAINS_SECTION__SURGICAL_DRAINS_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("SurgicalDrainsSectionTemplateId"),
					new Object[] { surgicalDrainsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgicalDrainsSectionCode(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgicalDrainsSectionCode(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGICAL_DRAINS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '11537-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgicalDrainsSectionCode(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgicalDrainsSectionCode(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SURGICAL_DRAINS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param surgicalDrainsSection The receiving '<em><b>Surgical Drains Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSurgicalDrainsSectionCode(SurgicalDrainsSection surgicalDrainsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SURGICAL_DRAINS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGICAL_DRAINS_SECTION);
			try {
				VALIDATE_SURGICAL_DRAINS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGICAL_DRAINS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGICAL_DRAINS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			surgicalDrainsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SURGICAL_DRAINS_SECTION__SURGICAL_DRAINS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("SurgicalDrainsSectionCode"),
					new Object[] { surgicalDrainsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgicalDrainsSectionCodeP(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgicalDrainsSectionCodeP(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGICAL_DRAINS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgicalDrainsSectionCodeP(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgicalDrainsSectionCodeP(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SURGICAL_DRAINS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param surgicalDrainsSection The receiving '<em><b>Surgical Drains Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSurgicalDrainsSectionCodeP(SurgicalDrainsSection surgicalDrainsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SURGICAL_DRAINS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGICAL_DRAINS_SECTION);
			try {
				VALIDATE_SURGICAL_DRAINS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGICAL_DRAINS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGICAL_DRAINS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			surgicalDrainsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SURGICAL_DRAINS_SECTION__SURGICAL_DRAINS_SECTION_CODE_P,
					ConsolPlugin.INSTANCE.getString("SurgicalDrainsSectionCodeP"),
					new Object[] { surgicalDrainsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgicalDrainsSectionText(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgicalDrainsSectionText(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGICAL_DRAINS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgicalDrainsSectionText(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgicalDrainsSectionText(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SURGICAL_DRAINS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param surgicalDrainsSection The receiving '<em><b>Surgical Drains Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSurgicalDrainsSectionText(SurgicalDrainsSection surgicalDrainsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SURGICAL_DRAINS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGICAL_DRAINS_SECTION);
			try {
				VALIDATE_SURGICAL_DRAINS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGICAL_DRAINS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGICAL_DRAINS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			surgicalDrainsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SURGICAL_DRAINS_SECTION__SURGICAL_DRAINS_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("SurgicalDrainsSectionText"),
					new Object[] { surgicalDrainsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgicalDrainsSectionTitle(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgicalDrainsSectionTitle(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGICAL_DRAINS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgicalDrainsSectionTitle(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgicalDrainsSectionTitle(SurgicalDrainsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SURGICAL_DRAINS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param surgicalDrainsSection The receiving '<em><b>Surgical Drains Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSurgicalDrainsSectionTitle(SurgicalDrainsSection surgicalDrainsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SURGICAL_DRAINS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGICAL_DRAINS_SECTION);
			try {
				VALIDATE_SURGICAL_DRAINS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGICAL_DRAINS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGICAL_DRAINS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			surgicalDrainsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SURGICAL_DRAINS_SECTION__SURGICAL_DRAINS_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("SurgicalDrainsSectionTitle"),
					new Object[] { surgicalDrainsSection }));
			}

			return false;
		}
		return true;
	}

} // SurgicalDrainsSectionOperations
