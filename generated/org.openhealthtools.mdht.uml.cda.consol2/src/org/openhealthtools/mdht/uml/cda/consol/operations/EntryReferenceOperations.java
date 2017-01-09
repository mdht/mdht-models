/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified OCL for VALIDATE_ENTRY_REFERENCE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *     								   due to OCL generation issue for a 0..0 situation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Entry Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceIINullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference II Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceCDNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference CD Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EntryReference#validateEntryReferenceCDNullFlavorP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference CD Null Flavor P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryReferenceOperations extends ClinicalStatementOperations {
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
	protected EntryReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEntryReferenceTemplateId(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceTemplateId(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENTRY_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.122')";

	/**
	 * The cached OCL invariant for the '{@link #validateEntryReferenceTemplateId(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceTemplateId(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENTRY_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param entryReference The receiving '<em><b>Entry Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEntryReferenceTemplateId(EntryReference entryReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ENTRY_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENTRY_REFERENCE);
			try {
				VALIDATE_ENTRY_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENTRY_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENTRY_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(entryReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENTRY_REFERENCE__ENTRY_REFERENCE_TEMPLATE_ID,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"EntryReferenceEntryReferenceTemplateId"),
						new Object[] { entryReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEntryReferenceClassCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceClassCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENTRY_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateEntryReferenceClassCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceClassCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENTRY_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param entryReference The receiving '<em><b>Entry Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEntryReferenceClassCode(EntryReference entryReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ENTRY_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENTRY_REFERENCE);
			try {
				VALIDATE_ENTRY_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENTRY_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENTRY_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(entryReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENTRY_REFERENCE__ENTRY_REFERENCE_CLASS_CODE,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"EntryReferenceEntryReferenceClassCode"),
						new Object[] { entryReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEntryReferenceMoodCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceMoodCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENTRY_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateEntryReferenceMoodCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceMoodCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENTRY_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param entryReference The receiving '<em><b>Entry Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEntryReferenceMoodCode(EntryReference entryReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ENTRY_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENTRY_REFERENCE);
			try {
				VALIDATE_ENTRY_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENTRY_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ENTRY_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			entryReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENTRY_REFERENCE__ENTRY_REFERENCE_MOOD_CODE,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"EntryReferenceEntryReferenceMoodCode"),
						new Object[] { entryReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEntryReferenceId(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceId(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENTRY_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateEntryReferenceId(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceId(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENTRY_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param entryReference The receiving '<em><b>Entry Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEntryReferenceId(EntryReference entryReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ENTRY_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENTRY_REFERENCE);
			try {
				VALIDATE_ENTRY_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENTRY_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ENTRY_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			entryReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENTRY_REFERENCE__ENTRY_REFERENCE_ID,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"EntryReferenceEntryReferenceId"),
						new Object[] { entryReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEntryReferenceCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENTRY_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEntryReferenceCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENTRY_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param entryReference The receiving '<em><b>Entry Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEntryReferenceCode(EntryReference entryReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ENTRY_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENTRY_REFERENCE);
			try {
				VALIDATE_ENTRY_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENTRY_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ENTRY_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			entryReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENTRY_REFERENCE__ENTRY_REFERENCE_CODE,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"EntryReferenceEntryReferenceCode"),
						new Object[] { entryReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEntryReferenceStatusCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceStatusCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENTRY_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEntryReferenceStatusCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceStatusCode(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENTRY_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param entryReference The receiving '<em><b>Entry Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEntryReferenceStatusCode(EntryReference entryReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ENTRY_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENTRY_REFERENCE);
			try {
				VALIDATE_ENTRY_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENTRY_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENTRY_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(entryReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENTRY_REFERENCE__ENTRY_REFERENCE_STATUS_CODE,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"EntryReferenceEntryReferenceStatusCode"),
						new Object[] { entryReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEntryReferenceStatusCodeP(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceStatusCodeP(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENTRY_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEntryReferenceStatusCodeP(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceStatusCodeP(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENTRY_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param entryReference The receiving '<em><b>Entry Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEntryReferenceStatusCodeP(EntryReference entryReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ENTRY_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENTRY_REFERENCE);
			try {
				VALIDATE_ENTRY_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENTRY_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENTRY_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(entryReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENTRY_REFERENCE__ENTRY_REFERENCE_STATUS_CODE_P,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"EntryReferenceEntryReferenceStatusCodeP"),
						new Object[] { entryReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEntryReferenceIINullFlavor(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference II Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceIINullFlavor(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_ENTRY_REFERENCE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->reject(isNullFlavorUndefined())";

	// old non-working generated version:
	// protected static final String VALIDATE_ENTRY_REFERENCE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP =
	// "self.id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (isDefined('nullFlavor') )))";

	/**
	 * The cached OCL invariant for the '{@link #validateEntryReferenceIINullFlavor(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference II Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceIINullFlavor(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ENTRY_REFERENCE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param entryReference The receiving '<em><b>Entry Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateEntryReferenceIINullFlavor(EntryReference entryReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ENTRY_REFERENCE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENTRY_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ENTRY_REFERENCE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ENTRY_REFERENCE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ENTRY_REFERENCE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			entryReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ENTRY_REFERENCE__ENTRY_REFERENCE_II_NULL_FLAVOR,
							org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
								"EntryReferenceEntryReferenceIINullFlavor"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEntryReferenceCDNullFlavor(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference CD Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceCDNullFlavor(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not nullFlavor.oclIsUndefined() and nullFlavor.oclIsKindOf(vocab::NullFlavor) and " +
			"let value : vocab::NullFlavor = nullFlavor.oclAsType(vocab::NullFlavor) in " +
			"value = vocab::NullFlavor::NP )))";

	/**
	 * The cached OCL invariant for the '{@link #validateEntryReferenceCDNullFlavor(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference CD Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceCDNullFlavor(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param entryReference The receiving '<em><b>Entry Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateEntryReferenceCDNullFlavor(EntryReference entryReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENTRY_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			entryReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ENTRY_REFERENCE__ENTRY_REFERENCE_CD_NULL_FLAVOR,
							org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
								"EntryReferenceEntryReferenceCDNullFlavor"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEntryReferenceCDNullFlavorP(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference CD Null Flavor P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceCDNullFlavorP(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (isDefined('nullFlavor') )))";

	/**
	 * The cached OCL invariant for the '{@link #validateEntryReferenceCDNullFlavorP(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Entry Reference CD Null Flavor P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEntryReferenceCDNullFlavorP(EntryReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param entryReference The receiving '<em><b>Entry Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateEntryReferenceCDNullFlavorP(EntryReference entryReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENTRY_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ENTRY_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			entryReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ENTRY_REFERENCE__ENTRY_REFERENCE_CD_NULL_FLAVOR_P,
							org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
								"EntryReferenceEntryReferenceCDNullFlavorP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // EntryReferenceOperations
