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
import org.eclipse.mdht.uml.cda.operations.CriterionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Precondition For Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreconditionForSubstanceAdministrationOperations extends CriterionOperations {
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
	protected PreconditionForSubstanceAdministrationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationTemplateId(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationTemplateId(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.25')";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationTemplateId(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationTemplateId(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionForSubstanceAdministration The receiving '<em><b>Precondition For Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionForSubstanceAdministrationTemplateId(
			PreconditionForSubstanceAdministration preconditionForSubstanceAdministration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preconditionForSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"PreconditionForSubstanceAdministrationPreconditionForSubstanceAdministrationTemplateId"),
						new Object[] { preconditionForSubstanceAdministration }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationCode(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCode(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationCode(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCode(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionForSubstanceAdministration The receiving '<em><b>Precondition For Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionForSubstanceAdministrationCode(
			PreconditionForSubstanceAdministration preconditionForSubstanceAdministration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preconditionForSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PreconditionForSubstanceAdministrationPreconditionForSubstanceAdministrationCode"),
						new Object[] { preconditionForSubstanceAdministration }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationText(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationText(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationText(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationText(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionForSubstanceAdministration The receiving '<em><b>Precondition For Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionForSubstanceAdministrationText(
			PreconditionForSubstanceAdministration preconditionForSubstanceAdministration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preconditionForSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEXT,
						ConsolPlugin.INSTANCE.getString(
							"PreconditionForSubstanceAdministrationPreconditionForSubstanceAdministrationText"),
						new Object[] { preconditionForSubstanceAdministration }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationValue(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationValue(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value.oclIsUndefined() or self.value.isNullFlavorUndefined()) implies (self.value.oclIsTypeOf(datatypes::CD))";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationValue(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationValue(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionForSubstanceAdministration The receiving '<em><b>Precondition For Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionForSubstanceAdministrationValue(
			PreconditionForSubstanceAdministration preconditionForSubstanceAdministration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				preconditionForSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"PreconditionForSubstanceAdministrationPreconditionForSubstanceAdministrationValue"),
						new Object[] { preconditionForSubstanceAdministration }));
			}

			return false;
		}
		return true;
	}

} // PreconditionForSubstanceAdministrationOperations
