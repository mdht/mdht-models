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
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Present Illness Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection#validateHistoryOfPresentIllnessSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection#validateHistoryOfPresentIllnessSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection#validateHistoryOfPresentIllnessSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection#validateHistoryOfPresentIllnessSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection#validateHistoryOfPresentIllnessSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryOfPresentIllnessSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryOfPresentIllnessSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfPresentIllnessSectionTemplateId(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPresentIllnessSectionTemplateId(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfPresentIllnessSectionTemplateId(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPresentIllnessSectionTemplateId(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfPresentIllnessSection The receiving '<em><b>History Of Present Illness Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryOfPresentIllnessSectionTemplateId(
			HistoryOfPresentIllnessSection historyOfPresentIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_OF_PRESENT_ILLNESS_SECTION);
			try {
				VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyOfPresentIllnessSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_OF_PRESENT_ILLNESS_SECTION__HISTORY_OF_PRESENT_ILLNESS_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HistoryOfPresentIllnessSectionTemplateId"),
					new Object[] { historyOfPresentIllnessSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfPresentIllnessSectionCode(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPresentIllnessSectionCode(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '10164-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfPresentIllnessSectionCode(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPresentIllnessSectionCode(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfPresentIllnessSection The receiving '<em><b>History Of Present Illness Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryOfPresentIllnessSectionCode(
			HistoryOfPresentIllnessSection historyOfPresentIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_OF_PRESENT_ILLNESS_SECTION);
			try {
				VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyOfPresentIllnessSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_OF_PRESENT_ILLNESS_SECTION__HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("HistoryOfPresentIllnessSectionCode"),
					new Object[] { historyOfPresentIllnessSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfPresentIllnessSectionCodeP(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPresentIllnessSectionCodeP(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfPresentIllnessSectionCodeP(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPresentIllnessSectionCodeP(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfPresentIllnessSection The receiving '<em><b>History Of Present Illness Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryOfPresentIllnessSectionCodeP(
			HistoryOfPresentIllnessSection historyOfPresentIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_OF_PRESENT_ILLNESS_SECTION);
			try {
				VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyOfPresentIllnessSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_OF_PRESENT_ILLNESS_SECTION__HISTORY_OF_PRESENT_ILLNESS_SECTION_CODE_P,
					ConsolPlugin.INSTANCE.getString("HistoryOfPresentIllnessSectionCodeP"),
					new Object[] { historyOfPresentIllnessSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfPresentIllnessSectionTitle(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPresentIllnessSectionTitle(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfPresentIllnessSectionTitle(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPresentIllnessSectionTitle(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfPresentIllnessSection The receiving '<em><b>History Of Present Illness Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryOfPresentIllnessSectionTitle(
			HistoryOfPresentIllnessSection historyOfPresentIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_OF_PRESENT_ILLNESS_SECTION);
			try {
				VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyOfPresentIllnessSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_OF_PRESENT_ILLNESS_SECTION__HISTORY_OF_PRESENT_ILLNESS_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("HistoryOfPresentIllnessSectionTitle"),
					new Object[] { historyOfPresentIllnessSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfPresentIllnessSectionText(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPresentIllnessSectionText(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfPresentIllnessSectionText(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Present Illness Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPresentIllnessSectionText(HistoryOfPresentIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfPresentIllnessSection The receiving '<em><b>History Of Present Illness Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryOfPresentIllnessSectionText(
			HistoryOfPresentIllnessSection historyOfPresentIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_OF_PRESENT_ILLNESS_SECTION);
			try {
				VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PRESENT_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyOfPresentIllnessSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_OF_PRESENT_ILLNESS_SECTION__HISTORY_OF_PRESENT_ILLNESS_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("HistoryOfPresentIllnessSectionText"),
					new Object[] { historyOfPresentIllnessSection }));
			}

			return false;
		}
		return true;
	}

} // HistoryOfPresentIllnessSectionOperations
