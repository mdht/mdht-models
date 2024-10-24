/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.LanguageCommunicationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Language Spoken</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken#validateLanguageSpokenNoProficiencyLevelCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken No Proficiency Level Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken#validateLanguageSpokenTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken#validateLanguageSpokenModeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Mode Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageSpokenOperations extends LanguageCommunicationOperations {
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
	protected LanguageSpokenOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken No Proficiency Level Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.proficiencyLevelCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken No Proficiency Level Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param languageSpoken The receiving '<em><b>Language Spoken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken languageSpoken,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.LANGUAGE_SPOKEN);
			try {
				VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				languageSpoken)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE,
						HITSPPlugin.INSTANCE.getString("LanguageSpokenLanguageSpokenNoProficiencyLevelCode"),
						new Object[] { languageSpoken }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLanguageSpokenTemplateId(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenTemplateId(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateLanguageSpokenTemplateId(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenTemplateId(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param languageSpoken The receiving '<em><b>Language Spoken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLanguageSpokenTemplateId(LanguageSpoken languageSpoken, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.LANGUAGE_SPOKEN);
			try {
				VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(languageSpoken)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_TEMPLATE_ID,
						HITSPPlugin.INSTANCE.getString("LanguageSpokenLanguageSpokenTemplateId"),
						new Object[] { languageSpoken }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLanguageSpokenModeCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Mode Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenModeCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.modeCode.oclIsUndefined() or self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined() and self.modeCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR'))";

	/**
	 * The cached OCL invariant for the '{@link #validateLanguageSpokenModeCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Mode Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenModeCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param languageSpoken The receiving '<em><b>Language Spoken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLanguageSpokenModeCode(LanguageSpoken languageSpoken, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.LANGUAGE_SPOKEN);
			try {
				VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			languageSpoken)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_MODE_CODE,
						HITSPPlugin.INSTANCE.getString("LanguageSpokenLanguageSpokenModeCode"),
						new Object[] { languageSpoken }));
			}

			return false;
		}
		return true;
	}

} // LanguageSpokenOperations
