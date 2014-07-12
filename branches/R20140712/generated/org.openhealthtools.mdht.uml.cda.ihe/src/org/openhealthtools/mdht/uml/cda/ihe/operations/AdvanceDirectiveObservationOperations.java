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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateIHEAdvanceDirectiveObservationHasExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Has External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateIHEAdvanceDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateIHEAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateIHEAdvanceDirectiveObservationRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateIHEAdvanceDirectiveObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateIHEAdvanceDirectiveObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveObservationOperations extends
		org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectiveObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEAdvanceDirectiveObservationHasExternalReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Has External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationHasExternalReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->select(r | r.oclIsKindOf(ccd::AdvanceDirectiveReference))->size() =1";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEAdvanceDirectiveObservationHasExternalReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Has External Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationHasExternalReference(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEAdvanceDirectiveObservationHasExternalReference(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ADVANCE_DIRECTIVE_OBSERVATION__IHE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE,
					IHEPlugin.INSTANCE.getString("IHEAdvanceDirectiveObservationHasExternalReference"),
					new Object[] { advanceDirectiveObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEAdvanceDirectiveObservationTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.13.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEAdvanceDirectiveObservationTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationTemplateId(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEAdvanceDirectiveObservationTemplateId(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ADVANCE_DIRECTIVE_OBSERVATION__IHE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("IHEAdvanceDirectiveObservationTemplateId"),
					new Object[] { advanceDirectiveObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEAdvanceDirectiveObservationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEAdvanceDirectiveObservationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEAdvanceDirectiveObservationCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ADVANCE_DIRECTIVE_OBSERVATION__IHE_ADVANCE_DIRECTIVE_OBSERVATION_CODE,
					IHEPlugin.INSTANCE.getString("IHEAdvanceDirectiveObservationCode"),
					new Object[] { advanceDirectiveObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEAdvanceDirectiveObservationRepeatNumber(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationRepeatNumber(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEAdvanceDirectiveObservationRepeatNumber(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationRepeatNumber(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEAdvanceDirectiveObservationRepeatNumber(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ADVANCE_DIRECTIVE_OBSERVATION__IHE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER,
					IHEPlugin.INSTANCE.getString("IHEAdvanceDirectiveObservationRepeatNumber"),
					new Object[] { advanceDirectiveObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEAdvanceDirectiveObservationInterpretationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationInterpretationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEAdvanceDirectiveObservationInterpretationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationInterpretationCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEAdvanceDirectiveObservationInterpretationCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ADVANCE_DIRECTIVE_OBSERVATION__IHE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE,
					IHEPlugin.INSTANCE.getString("IHEAdvanceDirectiveObservationInterpretationCode"),
					new Object[] { advanceDirectiveObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEAdvanceDirectiveObservationTargetSiteCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationTargetSiteCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEAdvanceDirectiveObservationTargetSiteCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEAdvanceDirectiveObservationTargetSiteCode(AdvanceDirectiveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation The receiving '<em><b>Advance Directive Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEAdvanceDirectiveObservationTargetSiteCode(
			AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION);
			try {
				VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ADVANCE_DIRECTIVE_OBSERVATION__IHE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE,
					IHEPlugin.INSTANCE.getString("IHEAdvanceDirectiveObservationTargetSiteCode"),
					new Object[] { advanceDirectiveObservation }));
			}

			return false;
		}
		return true;
	}

} // AdvanceDirectiveObservationOperations
