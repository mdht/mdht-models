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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.CodeObservations;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Code Observations</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsQuantityMeasurementObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Quantity Measurement Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#getSOPInstanceObservations() <em>Get SOP Instance Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#getQuantityMeasurementObservations() <em>Get Quantity Measurement Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeObservationsOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeObservationsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeObservationsTemplateId(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsTemplateId(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeObservationsTemplateId(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsTemplateId(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codeObservations The receiving '<em><b>Code Observations</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCodeObservationsTemplateId(CodeObservations codeObservations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CODE_OBSERVATIONS);
			try {
				VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codeObservations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CODE_OBSERVATIONS__CODE_OBSERVATIONS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("CodeObservationsCodeObservationsTemplateId"),
					new Object[] { codeObservations }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeObservationsClassCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsClassCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_OBSERVATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeObservationsClassCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsClassCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CODE_OBSERVATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codeObservations The receiving '<em><b>Code Observations</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCodeObservationsClassCode(CodeObservations codeObservations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODE_OBSERVATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CODE_OBSERVATIONS);
			try {
				VALIDATE_CODE_OBSERVATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_OBSERVATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_OBSERVATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codeObservations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CODE_OBSERVATIONS__CODE_OBSERVATIONS_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("CodeObservationsCodeObservationsClassCode"),
					new Object[] { codeObservations }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeObservationsMoodCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsMoodCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_OBSERVATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeObservationsMoodCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsMoodCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CODE_OBSERVATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codeObservations The receiving '<em><b>Code Observations</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCodeObservationsMoodCode(CodeObservations codeObservations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODE_OBSERVATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CODE_OBSERVATIONS);
			try {
				VALIDATE_CODE_OBSERVATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_OBSERVATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_OBSERVATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codeObservations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CODE_OBSERVATIONS__CODE_OBSERVATIONS_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("CodeObservationsCodeObservationsMoodCode"),
					new Object[] { codeObservations }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeObservationsCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_OBSERVATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeObservationsCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsCode(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CODE_OBSERVATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codeObservations The receiving '<em><b>Code Observations</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCodeObservationsCode(CodeObservations codeObservations, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CODE_OBSERVATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CODE_OBSERVATIONS);
			try {
				VALIDATE_CODE_OBSERVATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_OBSERVATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_OBSERVATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codeObservations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CODE_OBSERVATIONS__CODE_OBSERVATIONS_CODE,
					ConsolPlugin.INSTANCE.getString("CodeObservationsCodeObservationsCode"),
					new Object[] { codeObservations }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeObservationsEffectiveTime(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsEffectiveTime(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_OBSERVATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeObservationsEffectiveTime(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsEffectiveTime(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CODE_OBSERVATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codeObservations The receiving '<em><b>Code Observations</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCodeObservationsEffectiveTime(CodeObservations codeObservations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODE_OBSERVATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CODE_OBSERVATIONS);
			try {
				VALIDATE_CODE_OBSERVATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_OBSERVATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_OBSERVATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codeObservations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CODE_OBSERVATIONS__CODE_OBSERVATIONS_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("CodeObservationsCodeObservationsEffectiveTime"),
					new Object[] { codeObservations }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeObservationsValue(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsValue(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_OBSERVATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeObservationsValue(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsValue(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CODE_OBSERVATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codeObservations The receiving '<em><b>Code Observations</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCodeObservationsValue(CodeObservations codeObservations, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CODE_OBSERVATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CODE_OBSERVATIONS);
			try {
				VALIDATE_CODE_OBSERVATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_OBSERVATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_OBSERVATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codeObservations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CODE_OBSERVATIONS__CODE_OBSERVATIONS_VALUE,
					ConsolPlugin.INSTANCE.getString("CodeObservationsCodeObservationsValue"),
					new Object[] { codeObservations }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeObservationsSOPInstanceObservation(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations SOP Instance Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsSOPInstanceObservation(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_OBSERVATIONS_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SOPInstanceObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SPRT)";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeObservationsSOPInstanceObservation(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations SOP Instance Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsSOPInstanceObservation(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CODE_OBSERVATIONS_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codeObservations The receiving '<em><b>Code Observations</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCodeObservationsSOPInstanceObservation(CodeObservations codeObservations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODE_OBSERVATIONS_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CODE_OBSERVATIONS);
			try {
				VALIDATE_CODE_OBSERVATIONS_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_OBSERVATIONS_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_OBSERVATIONS_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codeObservations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CODE_OBSERVATIONS__CODE_OBSERVATIONS_SOP_INSTANCE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("CodeObservationsCodeObservationsSOPInstanceObservation"),
					new Object[] { codeObservations }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeObservationsQuantityMeasurementObservation(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Quantity Measurement Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsQuantityMeasurementObservation(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_OBSERVATIONS_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::QuantityMeasurementObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SPRT)";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeObservationsQuantityMeasurementObservation(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Quantity Measurement Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsQuantityMeasurementObservation(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CODE_OBSERVATIONS_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codeObservations The receiving '<em><b>Code Observations</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCodeObservationsQuantityMeasurementObservation(CodeObservations codeObservations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODE_OBSERVATIONS_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CODE_OBSERVATIONS);
			try {
				VALIDATE_CODE_OBSERVATIONS_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_OBSERVATIONS_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CODE_OBSERVATIONS_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codeObservations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CODE_OBSERVATIONS__CODE_OBSERVATIONS_QUANTITY_MEASUREMENT_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("CodeObservationsCodeObservationsQuantityMeasurementObservation"),
					new Object[] { codeObservations }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSOPInstanceObservations(CodeObservations) <em>Get SOP Instance Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOPInstanceObservations(CodeObservations)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOP_INSTANCE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation)).oclAsType(consol::SOPInstanceObservation)";

	/**
	 * The cached OCL query for the '{@link #getSOPInstanceObservations(CodeObservations) <em>Get SOP Instance Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOPInstanceObservations(CodeObservations)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SOPInstanceObservation> getSOPInstanceObservations(CodeObservations codeObservations) {
		if (GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CODE_OBSERVATIONS,
				ConsolPackage.Literals.CODE_OBSERVATIONS.getEAllOperations().get(59));
			try {
				GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_SOP_INSTANCE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SOPInstanceObservation> result = (Collection<SOPInstanceObservation>) query.evaluate(codeObservations);
		return new BasicEList.UnmodifiableEList<SOPInstanceObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuantityMeasurementObservations(CodeObservations) <em>Get Quantity Measurement Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityMeasurementObservations(CodeObservations)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUANTITY_MEASUREMENT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::QuantityMeasurementObservation)).oclAsType(consol::QuantityMeasurementObservation)";

	/**
	 * The cached OCL query for the '{@link #getQuantityMeasurementObservations(CodeObservations) <em>Get Quantity Measurement Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityMeasurementObservations(CodeObservations)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_QUANTITY_MEASUREMENT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<QuantityMeasurementObservation> getQuantityMeasurementObservations(
			CodeObservations codeObservations) {
		if (GET_QUANTITY_MEASUREMENT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CODE_OBSERVATIONS,
				ConsolPackage.Literals.CODE_OBSERVATIONS.getEAllOperations().get(60));
			try {
				GET_QUANTITY_MEASUREMENT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_QUANTITY_MEASUREMENT_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_QUANTITY_MEASUREMENT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuantityMeasurementObservation> result = (Collection<QuantityMeasurementObservation>) query.evaluate(codeObservations);
		return new BasicEList.UnmodifiableEList<QuantityMeasurementObservation>(result.size(), result.toArray());
	}

} // CodeObservationsOperations
