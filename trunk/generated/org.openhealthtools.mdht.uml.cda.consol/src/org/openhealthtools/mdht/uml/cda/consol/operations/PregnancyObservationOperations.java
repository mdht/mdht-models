/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#validatePregnancyObservationEstimatedDateOfDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Estimated Date Of Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation#getEstimatedDateOfDelivery() <em>Get Estimated Date Of Delivery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PregnancyObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PregnancyObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationTemplateId(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationTemplateId(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.8')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationTemplateId(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationTemplateId(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PREGNANCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.8')
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationTemplateId(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PregnancyObservationTemplateId"),
					new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationClassCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationClassCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationClassCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationClassCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PREGNANCY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationClassCode(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("PregnancyObservationClassCode"),
					new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationMoodCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationMoodCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationMoodCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationMoodCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PREGNANCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('moodCode')
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationMoodCode(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("PregnancyObservationMoodCode"),
					new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationCode(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("PregnancyObservationCode"), new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationStatusCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationStatusCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationStatusCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationStatusCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PREGNANCY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationStatusCode(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("PregnancyObservationStatusCode"),
					new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationValue(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationValue(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.code = '77386006' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationValue(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationValue(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.code = '77386006' and value.codeSystem = '2.16.840.1.113883.6.96'))
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationValue(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("PregnancyObservationValue"), new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationEffectiveTime(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationEffectiveTime(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationEffectiveTime(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationEffectiveTime(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PREGNANCY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationEffectiveTime(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("PregnancyObservationEffectiveTime"),
					new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationEstimatedDateOfDelivery(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Estimated Date Of Delivery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationEstimatedDateOfDelivery(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_ESTIMATED_DATE_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::EstimatedDateOfDelivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationEstimatedDateOfDelivery(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Estimated Date Of Delivery</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationEstimatedDateOfDelivery(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PREGNANCY_OBSERVATION_ESTIMATED_DATE_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::EstimatedDateOfDelivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyObservationEstimatedDateOfDelivery(
			PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_ESTIMATED_DATE_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_ESTIMATED_DATE_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_OBSERVATION_ESTIMATED_DATE_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PREGNANCY_OBSERVATION_ESTIMATED_DATE_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_ESTIMATED_DATE_OF_DELIVERY,
					ConsolPlugin.INSTANCE.getString("PregnancyObservationEstimatedDateOfDelivery"),
					new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEstimatedDateOfDelivery(PregnancyObservation) <em>Get Estimated Date Of Delivery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDateOfDelivery(PregnancyObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ESTIMATED_DATE_OF_DELIVERY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::EstimatedDateOfDelivery))->asSequence()->first().oclAsType(consol::EstimatedDateOfDelivery)";

	/**
	 * The cached OCL query for the '{@link #getEstimatedDateOfDelivery(PregnancyObservation) <em>Get Estimated Date Of Delivery</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDateOfDelivery(PregnancyObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ESTIMATED_DATE_OF_DELIVERY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::EstimatedDateOfDelivery))->asSequence()->first().oclAsType(consol::EstimatedDateOfDelivery)
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EstimatedDateOfDelivery getEstimatedDateOfDelivery(PregnancyObservation pregnancyObservation) {
		if (GET_ESTIMATED_DATE_OF_DELIVERY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PREGNANCY_OBSERVATION,
				ConsolPackage.Literals.PREGNANCY_OBSERVATION.getEAllOperations().get(59));
			try {
				GET_ESTIMATED_DATE_OF_DELIVERY__EOCL_QRY = helper.createQuery(GET_ESTIMATED_DATE_OF_DELIVERY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ESTIMATED_DATE_OF_DELIVERY__EOCL_QRY);
		return (EstimatedDateOfDelivery) query.evaluate(pregnancyObservation);
	}

} // PregnancyObservationOperations
