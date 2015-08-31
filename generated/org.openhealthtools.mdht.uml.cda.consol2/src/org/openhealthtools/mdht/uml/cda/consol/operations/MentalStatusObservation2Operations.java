/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2ValueDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Value Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2AssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2ReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 CD Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MentalStatusObservation2Operations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentalStatusObservation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2ValueDatatype(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Value Datatype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2ValueDatatype(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->forAll(val | val.oclIsTypeOf(datatypes::CD) implies (val.isNullFlavorDefined() or val.oclAsType(datatypes::CD).codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2ValueDatatype(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Value Datatype</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2ValueDatatype(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2ValueDatatype(
			MentalStatusObservation2 mentalStatusObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_VALUE_DATATYPE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2ValueDatatype"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2TemplateId(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2TemplateId(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.74' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2TemplateId(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2TemplateId(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2TemplateId(MentalStatusObservation2 mentalStatusObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2TemplateId"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2ClassCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2ClassCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2ClassCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2ClassCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2ClassCode(MentalStatusObservation2 mentalStatusObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2ClassCode"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2MoodCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2MoodCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2MoodCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2MoodCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2MoodCode(MentalStatusObservation2 mentalStatusObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2MoodCode"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2Id(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2Id(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2Id(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2Id(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2Id(MentalStatusObservation2 mentalStatusObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_ID,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2Id"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2CodeP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2CodeP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2CodeP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2CodeP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2CodeP(MentalStatusObservation2 mentalStatusObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_CODE_P,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2CodeP"),
					new Object[] { mentalStatusObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2CodeP", passToken);
				}
				passToken.add(mentalStatusObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2Code(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2Code(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '373930000' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2Code(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2Code(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2Code(MentalStatusObservation2 mentalStatusObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(mentalStatusObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_CODE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2Code"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2StatusCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2StatusCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2StatusCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2StatusCode(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2StatusCode(MentalStatusObservation2 mentalStatusObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2StatusCode"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2StatusCodeP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2StatusCodeP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2StatusCodeP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2StatusCodeP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2StatusCodeP(
			MentalStatusObservation2 mentalStatusObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2StatusCodeP"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2EffectiveTime(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2EffectiveTime(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2EffectiveTime(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2EffectiveTime(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2EffectiveTime(
			MentalStatusObservation2 mentalStatusObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2EffectiveTime"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2Value(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2Value(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2Value(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2Value(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2Value(MentalStatusObservation2 mentalStatusObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_VALUE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2Value"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2AuthorParticipation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2AuthorParticipation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2AuthorParticipation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2AuthorParticipation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2AuthorParticipation(
			MentalStatusObservation2 mentalStatusObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MENTAL_STATUS_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2AuthorParticipation"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2AssessmentScaleObservation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Assessment Scale Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2AssessmentScaleObservation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AssessmentScaleObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2AssessmentScaleObservation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Assessment Scale Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2AssessmentScaleObservation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2AssessmentScaleObservation(
			MentalStatusObservation2 mentalStatusObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MENTAL_STATUS_OBSERVATION2_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_ASSESSMENT_SCALE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2AssessmentScaleObservation"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2ReferenceRange(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Reference Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2ReferenceRange(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->exists(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(rim::ActRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2ReferenceRange(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Reference Range</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2ReferenceRange(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_OBSERVATION2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusObservation2ReferenceRange(
			MentalStatusObservation2 mentalStatusObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				VALIDATE_MENTAL_STATUS_OBSERVATION2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_OBSERVATION2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_REFERENCE_RANGE,
					ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2ReferenceRange"),
					new Object[] { mentalStatusObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2CDTranslation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 CD Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2CDTranslation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1 and translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.code = '75275-8' and value.codeSystem = '2.16.840.1.113883.6.1')) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2CDTranslation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 CD Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2CDTranslation(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMentalStatusObservation2CDTranslation(
			MentalStatusObservation2 mentalStatusObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(mentalStatusObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION,
						ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2CDTranslation"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusObservation2CDTranslationP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 CD Translation P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2CDTranslationP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusObservation2CDTranslationP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 CD Translation P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusObservation2CDTranslationP(MentalStatusObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusObservation2 The receiving '<em><b>Mental Status Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMentalStatusObservation2CDTranslationP(
			MentalStatusObservation2 mentalStatusObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(mentalStatusObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MENTAL_STATUS_OBSERVATION2__MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION_P,
						ConsolPlugin.INSTANCE.getString("MentalStatusObservation2MentalStatusObservation2CDTranslationP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentScaleObservations(MentalStatusObservation2) <em>Get Assessment Scale Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(MentalStatusObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentScaleObservations(MentalStatusObservation2) <em>Get Assessment Scale Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(MentalStatusObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AssessmentScaleObservation> getAssessmentScaleObservations(
			MentalStatusObservation2 mentalStatusObservation2) {
		if (GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2,
				ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2.getEAllOperations().get(67));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservation> result = (Collection<AssessmentScaleObservation>) query.evaluate(mentalStatusObservation2);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservation>(result.size(), result.toArray());
	}

} // MentalStatusObservation2Operations
