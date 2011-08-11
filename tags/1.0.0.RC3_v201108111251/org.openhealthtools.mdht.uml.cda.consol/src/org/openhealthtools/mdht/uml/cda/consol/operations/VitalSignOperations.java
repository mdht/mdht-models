/*******************************************************************************
 * Copyright (c) 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
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
import org.openhealthtools.mdht.uml.cda.consol.VitalSign;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignOperations extends ResultOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVitalSignInterpretationCode(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.VITAL_SIGN__VITAL_SIGN_INTERPRETATION_CODE,
					ConsolPlugin.INSTANCE.getString("VitalSignInterpretationCode"), new Object[] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignMethodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignMethodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignMethodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignMethodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVitalSignMethodCode(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.VITAL_SIGN__VITAL_SIGN_METHOD_CODE,
					ConsolPlugin.INSTANCE.getString("VitalSignMethodCode"), new Object[] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVitalSignTargetSiteCode(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.VITAL_SIGN__VITAL_SIGN_TARGET_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("VitalSignTargetSiteCode"), new Object[] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVitalSignValue(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.VITAL_SIGN__VITAL_SIGN_VALUE,
					ConsolPlugin.INSTANCE.getString("VitalSignValue"), new Object[] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.14')
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultTemplateId(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.VITAL_SIGN__RESULT_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ResultTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSign, context) }),
					new Object[] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '8310-5' or value.code = '8462-4' or value.code = '8480-6' or value.code = '8287-5' or value.code = '8867-4' or value.code = '8302-2' or value.code = '8306-3' or value.code = '2710-2' or value.code = '9279-1' or value.code = '3141-9')))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '8310-5' or value.code = '8462-4' or value.code = '8480-6' or value.code = '8287-5' or value.code = '8867-4' or value.code = '8302-2' or value.code = '8306-3' or value.code = '2710-2' or value.code = '9279-1' or value.code = '3141-9')))
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultCode(VitalSign vitalSign, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.VITAL_SIGN__RESULT_CODE,
					ConsolPlugin.INSTANCE.getString("ResultCode"), new Object[] { vitalSign }));
			}
			return false;
		}
		return true;
	}

} // VitalSignOperations
