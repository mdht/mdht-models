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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PatientInstructionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Medical Instructions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions#validatePatientMedicalInstructionsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions#validatePatientMedicalInstructionsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions#validatePatientMedicalInstructionsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions#validatePatientMedicalInstructionsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions#validatePatientMedicalInstructionsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions#validatePatientMedicalInstructionsText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientMedicalInstructionsOperations extends PatientInstructionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PatientMedicalInstructionsOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsTemplateId(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsTemplateId(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.3')";

	/**
	* The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsTemplateId(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsTemplateId(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePatientMedicalInstructionsTemplateId(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("PatientMedicalInstructionsTemplateId"),
					new Object[] { patientMedicalInstructions }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsClassCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsClassCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	* The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsClassCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsClassCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePatientMedicalInstructionsClassCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE,
					IHEPlugin.INSTANCE.getString("PatientMedicalInstructionsClassCode"),
					new Object[] { patientMedicalInstructions }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsCodeP(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsCodeP(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsCodeP(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsCodeP(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePatientMedicalInstructionsCodeP(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_CODE_P,
					IHEPlugin.INSTANCE.getString("PatientMedicalInstructionsCodeP"),
					new Object[] { patientMedicalInstructions }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructionsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructionsCodeP", passToken);
				}
				passToken.add(patientMedicalInstructions);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = 'PINSTRUCT' and value.codeSystem = '1.3.6.1.4.1.19376.1.5.3.2')";

	/**
	* The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePatientMedicalInstructionsCode(PatientMedicalInstructions patientMedicalInstructions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructionsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(patientMedicalInstructions)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_CODE,
					IHEPlugin.INSTANCE.getString("PatientMedicalInstructionsCode"),
					new Object[] { patientMedicalInstructions }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsStatusCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Status Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsStatusCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsStatusCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Status Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsStatusCode(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePatientMedicalInstructionsStatusCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE,
					IHEPlugin.INSTANCE.getString("PatientMedicalInstructionsStatusCode"),
					new Object[] { patientMedicalInstructions }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePatientMedicalInstructionsText(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsText(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validatePatientMedicalInstructionsText(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePatientMedicalInstructionsText(PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param patientMedicalInstructions The receiving '<em><b>Patient Medical Instructions</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePatientMedicalInstructionsText(PatientMedicalInstructions patientMedicalInstructions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS);
			try {
				VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientMedicalInstructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_TEXT,
					IHEPlugin.INSTANCE.getString("PatientMedicalInstructionsText"),
					new Object[] { patientMedicalInstructions }));
			}

			return false;
		}
		return true;
	}

} // PatientMedicalInstructionsOperations
