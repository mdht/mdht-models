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
package org.openhealthtools.mdht.uml.cda.phcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Susceptibility Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SusceptibilityResultOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SusceptibilityResultOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSusceptibilityResultTemplateId(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultTemplateId(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUSCEPTIBILITY_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.10')";

	/**
	 * The cached OCL invariant for the '{@link #validateSusceptibilityResultTemplateId(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultTemplateId(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUSCEPTIBILITY_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.10')
	 * @param susceptibilityResult The receiving '<em><b>Susceptibility Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSusceptibilityResultTemplateId(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUSCEPTIBILITY_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.SUSCEPTIBILITY_RESULT);
			try {
				VALIDATE_SUSCEPTIBILITY_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUSCEPTIBILITY_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUSCEPTIBILITY_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(susceptibilityResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_TEMPLATE_ID,
						 PhcrPlugin.INSTANCE.getString("SusceptibilityResultTemplateId"),
						 new Object [] { susceptibilityResult }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSusceptibilityResultClassCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultClassCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUSCEPTIBILITY_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateSusceptibilityResultClassCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultClassCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUSCEPTIBILITY_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param susceptibilityResult The receiving '<em><b>Susceptibility Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSusceptibilityResultClassCode(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUSCEPTIBILITY_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.SUSCEPTIBILITY_RESULT);
			try {
				VALIDATE_SUSCEPTIBILITY_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUSCEPTIBILITY_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUSCEPTIBILITY_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(susceptibilityResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_CLASS_CODE,
						 PhcrPlugin.INSTANCE.getString("SusceptibilityResultClassCode"),
						 new Object [] { susceptibilityResult }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSusceptibilityResultMoodCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultMoodCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUSCEPTIBILITY_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSusceptibilityResultMoodCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultMoodCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUSCEPTIBILITY_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param susceptibilityResult The receiving '<em><b>Susceptibility Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSusceptibilityResultMoodCode(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUSCEPTIBILITY_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.SUSCEPTIBILITY_RESULT);
			try {
				VALIDATE_SUSCEPTIBILITY_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUSCEPTIBILITY_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUSCEPTIBILITY_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(susceptibilityResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_MOOD_CODE,
						 PhcrPlugin.INSTANCE.getString("SusceptibilityResultMoodCode"),
						 new Object [] { susceptibilityResult }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSusceptibilityResultCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUSCEPTIBILITY_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '18769-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSusceptibilityResultCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUSCEPTIBILITY_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = '18769-0' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param susceptibilityResult The receiving '<em><b>Susceptibility Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSusceptibilityResultCode(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUSCEPTIBILITY_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.SUSCEPTIBILITY_RESULT);
			try {
				VALIDATE_SUSCEPTIBILITY_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUSCEPTIBILITY_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUSCEPTIBILITY_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(susceptibilityResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_CODE,
						 PhcrPlugin.INSTANCE.getString("SusceptibilityResultCode"),
						 new Object [] { susceptibilityResult }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSusceptibilityResultCodeP(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultCodeP(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUSCEPTIBILITY_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSusceptibilityResultCodeP(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultCodeP(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SUSCEPTIBILITY_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param susceptibilityResult The receiving '<em><b>Susceptibility Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSusceptibilityResultCodeP(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUSCEPTIBILITY_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.SUSCEPTIBILITY_RESULT);
			try {
				VALIDATE_SUSCEPTIBILITY_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUSCEPTIBILITY_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUSCEPTIBILITY_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(susceptibilityResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_CODE_P,
						 PhcrPlugin.INSTANCE.getString("SusceptibilityResultCodeP"),
						 new Object [] { susceptibilityResult }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSusceptibilityResultStatusCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultStatusCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUSCEPTIBILITY_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateSusceptibilityResultStatusCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSusceptibilityResultStatusCode(SusceptibilityResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUSCEPTIBILITY_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param susceptibilityResult The receiving '<em><b>Susceptibility Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSusceptibilityResultStatusCode(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUSCEPTIBILITY_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.SUSCEPTIBILITY_RESULT);
			try {
				VALIDATE_SUSCEPTIBILITY_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUSCEPTIBILITY_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUSCEPTIBILITY_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(susceptibilityResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_STATUS_CODE,
						 PhcrPlugin.INSTANCE.getString("SusceptibilityResultStatusCode"),
						 new Object [] { susceptibilityResult }));
			}
			return false;
		}
		return true;
	}

} // SusceptibilityResultOperations