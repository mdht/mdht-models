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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Quantity Measurement Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationCodeCodeSystemDIR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code Code System DIR</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationCodeCodeSystemDICOM(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code Code System DICOM</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#getSOPInstanceObservations() <em>Get SOP Instance Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantityMeasurementObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityMeasurementObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuantityMeasurementObservationCodeCodeSystemDIR(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code Code System DIR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationCodeCodeSystemDIR(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DIR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.isNullFlavorDefined() or self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateQuantityMeasurementObservationCodeCodeSystemDIR(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code Code System DIR</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationCodeCodeSystemDIR(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DIR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param quantityMeasurementObservation The receiving '<em><b>Quantity Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuantityMeasurementObservationCodeCodeSystemDIR(
			QuantityMeasurementObservation quantityMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DIR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DIR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DIR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DIR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				quantityMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.QUANTITY_MEASUREMENT_OBSERVATION__QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DIR,
						ConsolPlugin.INSTANCE.getString(
							"QuantityMeasurementObservationQuantityMeasurementObservationCodeCodeSystemDIR"),
						new Object[] { quantityMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuantityMeasurementObservationCodeCodeSystemDICOM(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code Code System DICOM</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationCodeCodeSystemDICOM(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.isNullFlavorDefined() or self.code.codeSystem='1.2.840.10008.2.16.4'";

	/**
	 * The cached OCL invariant for the '{@link #validateQuantityMeasurementObservationCodeCodeSystemDICOM(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code Code System DICOM</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationCodeCodeSystemDICOM(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param quantityMeasurementObservation The receiving '<em><b>Quantity Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuantityMeasurementObservationCodeCodeSystemDICOM(
			QuantityMeasurementObservation quantityMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				quantityMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.QUANTITY_MEASUREMENT_OBSERVATION__QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DICOM,
						ConsolPlugin.INSTANCE.getString(
							"QuantityMeasurementObservationQuantityMeasurementObservationCodeCodeSystemDICOM"),
						new Object[] { quantityMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuantityMeasurementObservationTemplateId(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationTemplateId(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuantityMeasurementObservationTemplateId(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationTemplateId(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param quantityMeasurementObservation The receiving '<em><b>Quantity Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuantityMeasurementObservationTemplateId(
			QuantityMeasurementObservation quantityMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				quantityMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.QUANTITY_MEASUREMENT_OBSERVATION__QUANTITY_MEASUREMENT_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"QuantityMeasurementObservationQuantityMeasurementObservationTemplateId"),
						new Object[] { quantityMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuantityMeasurementObservationClassCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationClassCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateQuantityMeasurementObservationClassCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationClassCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param quantityMeasurementObservation The receiving '<em><b>Quantity Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuantityMeasurementObservationClassCode(
			QuantityMeasurementObservation quantityMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				quantityMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.QUANTITY_MEASUREMENT_OBSERVATION__QUANTITY_MEASUREMENT_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"QuantityMeasurementObservationQuantityMeasurementObservationClassCode"),
						new Object[] { quantityMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuantityMeasurementObservationMoodCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationMoodCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateQuantityMeasurementObservationMoodCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationMoodCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param quantityMeasurementObservation The receiving '<em><b>Quantity Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuantityMeasurementObservationMoodCode(
			QuantityMeasurementObservation quantityMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				quantityMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.QUANTITY_MEASUREMENT_OBSERVATION__QUANTITY_MEASUREMENT_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"QuantityMeasurementObservationQuantityMeasurementObservationMoodCode"),
						new Object[] { quantityMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuantityMeasurementObservationCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuantityMeasurementObservationCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationCode(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param quantityMeasurementObservation The receiving '<em><b>Quantity Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuantityMeasurementObservationCode(
			QuantityMeasurementObservation quantityMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			quantityMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.QUANTITY_MEASUREMENT_OBSERVATION__QUANTITY_MEASUREMENT_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"QuantityMeasurementObservationQuantityMeasurementObservationCode"),
						new Object[] { quantityMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuantityMeasurementObservationEffectiveTime(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationEffectiveTime(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuantityMeasurementObservationEffectiveTime(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationEffectiveTime(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param quantityMeasurementObservation The receiving '<em><b>Quantity Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuantityMeasurementObservationEffectiveTime(
			QuantityMeasurementObservation quantityMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				quantityMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.QUANTITY_MEASUREMENT_OBSERVATION__QUANTITY_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"QuantityMeasurementObservationQuantityMeasurementObservationEffectiveTime"),
						new Object[] { quantityMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuantityMeasurementObservationValue(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationValue(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuantityMeasurementObservationValue(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationValue(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param quantityMeasurementObservation The receiving '<em><b>Quantity Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuantityMeasurementObservationValue(
			QuantityMeasurementObservation quantityMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				quantityMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.QUANTITY_MEASUREMENT_OBSERVATION__QUANTITY_MEASUREMENT_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"QuantityMeasurementObservationQuantityMeasurementObservationValue"),
						new Object[] { quantityMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuantityMeasurementObservationSOPInstanceObservation(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation SOP Instance Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationSOPInstanceObservation(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SOPInstanceObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SPRT)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuantityMeasurementObservationSOPInstanceObservation(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation SOP Instance Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuantityMeasurementObservationSOPInstanceObservation(QuantityMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param quantityMeasurementObservation The receiving '<em><b>Quantity Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuantityMeasurementObservationSOPInstanceObservation(
			QuantityMeasurementObservation quantityMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				quantityMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.QUANTITY_MEASUREMENT_OBSERVATION__QUANTITY_MEASUREMENT_OBSERVATION_SOP_INSTANCE_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"QuantityMeasurementObservationQuantityMeasurementObservationSOPInstanceObservation"),
						new Object[] { quantityMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSOPInstanceObservations(QuantityMeasurementObservation) <em>Get SOP Instance Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOPInstanceObservations(QuantityMeasurementObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOP_INSTANCE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation)).oclAsType(consol::SOPInstanceObservation)";

	/**
	 * The cached OCL query for the '{@link #getSOPInstanceObservations(QuantityMeasurementObservation) <em>Get SOP Instance Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOPInstanceObservations(QuantityMeasurementObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SOPInstanceObservation> getSOPInstanceObservations(
			QuantityMeasurementObservation quantityMeasurementObservation) {
		if (GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION,
				ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION.getEAllOperations().get(60));
			try {
				GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_SOP_INSTANCE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SOPInstanceObservation> result = (Collection<SOPInstanceObservation>) query.evaluate(
			quantityMeasurementObservation);
		return new BasicEList.UnmodifiableEList<SOPInstanceObservation>(result.size(), result.toArray());
	}

} // QuantityMeasurementObservationOperations
