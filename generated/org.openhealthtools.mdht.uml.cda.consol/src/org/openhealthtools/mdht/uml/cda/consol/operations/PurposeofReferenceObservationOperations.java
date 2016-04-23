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
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Purposeof Reference Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurposeofReferenceObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeofReferenceObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeofReferenceObservationCodeCodeSystem(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Code Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationCodeCodeSystem(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.isNullFlavorDefined() or (self.code.code = 'ASSERTION' and self.code.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeofReferenceObservationCodeCodeSystem(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Code Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationCodeCodeSystem(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeofReferenceObservation The receiving '<em><b>Purposeof Reference Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePurposeofReferenceObservationCodeCodeSystem(
			PurposeofReferenceObservation purposeofReferenceObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PURPOSEOF_REFERENCE_OBSERVATION);
			try {
				VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeofReferenceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PURPOSEOF_REFERENCE_OBSERVATION__PURPOSEOF_REFERENCE_OBSERVATION_CODE_CODE_SYSTEM,
						 ConsolPlugin.INSTANCE.getString("PurposeofReferenceObservationPurposeofReferenceObservationCodeCodeSystem"),
						 new Object [] { purposeofReferenceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeofReferenceObservationTemplateId(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationTemplateId(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.9')";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeofReferenceObservationTemplateId(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationTemplateId(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeofReferenceObservation The receiving '<em><b>Purposeof Reference Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePurposeofReferenceObservationTemplateId(
			PurposeofReferenceObservation purposeofReferenceObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PURPOSEOF_REFERENCE_OBSERVATION);
			try {
				VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeofReferenceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PURPOSEOF_REFERENCE_OBSERVATION__PURPOSEOF_REFERENCE_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("PurposeofReferenceObservationPurposeofReferenceObservationTemplateId"),
						 new Object [] { purposeofReferenceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeofReferenceObservationClassCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationClassCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeofReferenceObservationClassCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationClassCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeofReferenceObservation The receiving '<em><b>Purposeof Reference Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePurposeofReferenceObservationClassCode(
			PurposeofReferenceObservation purposeofReferenceObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PURPOSEOF_REFERENCE_OBSERVATION);
			try {
				VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeofReferenceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PURPOSEOF_REFERENCE_OBSERVATION__PURPOSEOF_REFERENCE_OBSERVATION_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("PurposeofReferenceObservationPurposeofReferenceObservationClassCode"),
						 new Object [] { purposeofReferenceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeofReferenceObservationCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeofReferenceObservationCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeofReferenceObservation The receiving '<em><b>Purposeof Reference Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePurposeofReferenceObservationCode(
			PurposeofReferenceObservation purposeofReferenceObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PURPOSEOF_REFERENCE_OBSERVATION);
			try {
				VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeofReferenceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PURPOSEOF_REFERENCE_OBSERVATION__PURPOSEOF_REFERENCE_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("PurposeofReferenceObservationPurposeofReferenceObservationCode"),
						 new Object [] { purposeofReferenceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeofReferenceObservationMoodCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationMoodCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeofReferenceObservationMoodCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationMoodCode(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeofReferenceObservation The receiving '<em><b>Purposeof Reference Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePurposeofReferenceObservationMoodCode(
			PurposeofReferenceObservation purposeofReferenceObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PURPOSEOF_REFERENCE_OBSERVATION);
			try {
				VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeofReferenceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PURPOSEOF_REFERENCE_OBSERVATION__PURPOSEOF_REFERENCE_OBSERVATION_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("PurposeofReferenceObservationPurposeofReferenceObservationMoodCode"),
						 new Object [] { purposeofReferenceObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeofReferenceObservationValue(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationValue(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '1.2.840.10008.2.16.4' and (value.code = '121079' or value.code = '121080' or value.code = '121112')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeofReferenceObservationValue(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeofReferenceObservationValue(PurposeofReferenceObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeofReferenceObservation The receiving '<em><b>Purposeof Reference Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePurposeofReferenceObservationValue(
			PurposeofReferenceObservation purposeofReferenceObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PURPOSEOF_REFERENCE_OBSERVATION);
			try {
				VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeofReferenceObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PURPOSEOF_REFERENCE_OBSERVATION__PURPOSEOF_REFERENCE_OBSERVATION_VALUE,
						 ConsolPlugin.INSTANCE.getString("PurposeofReferenceObservationPurposeofReferenceObservationValue"),
						 new Object [] { purposeofReferenceObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // PurposeofReferenceObservationOperations
