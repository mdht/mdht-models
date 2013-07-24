/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cognitive Status Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationValueDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Value Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range No Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationReferenceRangeObservationRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CognitiveStatusResultObservationOperations extends ResultObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CognitiveStatusResultObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationTextReference(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationTextReference(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()  implies (self.text->forAll(reference->size() = 1) and self.text->forAll(reference->one(value->size() = 1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationTextReference(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationTextReference(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationTextReference(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationTextReference"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationTextReferenceValue(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationTextReferenceValue(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationTextReferenceValue(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationTextReferenceValue(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationTextReferenceValue(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationTextReferenceValue"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationValueDatatype(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Value Datatype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationValueDatatype(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->forAll(val | val.oclIsTypeOf(datatypes::CD) implies (val.isNullFlavorDefined() or val.oclAsType(datatypes::CD).codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationValueDatatype(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Value Datatype</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationValueDatatype(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationValueDatatype(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationValueDatatype"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationClassCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationClassCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationClassCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationClassCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationClassCode(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationClassCode"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationMoodCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationMoodCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationMoodCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationMoodCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationMoodCode(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationMoodCode"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationId(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationId(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationId(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationId(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationId(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationId"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationCodeP(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationCodeP(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationCodeP(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationCodeP(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationCodeP(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationCodeP"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservationCodeP", passToken);
				}
				passToken.add(cognitiveStatusResultObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '373930000' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationCode(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(cognitiveStatusResultObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationCode"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationText(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationText(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationText(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationText(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationText(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationText"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationStatusCodeP(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationStatusCodeP(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationStatusCodeP(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationStatusCodeP(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationStatusCodeP(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationStatusCodeP"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservationStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservationStatusCodeP",
						passToken);
				}
				passToken.add(cognitiveStatusResultObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationStatusCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationStatusCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationStatusCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationStatusCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationStatusCode(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservationStatusCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(cognitiveStatusResultObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationStatusCode"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationEffectiveTime(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationEffectiveTime(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationEffectiveTime(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationEffectiveTime(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationEffectiveTime(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationEffectiveTime"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationValue(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationValue(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationValue(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationValue(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationValue(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationValue"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationInterpretationCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationInterpretationCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationInterpretationCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationInterpretationCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationInterpretationCode(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_INTERPRETATION_CODE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationInterpretationCode"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationMethodCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationMethodCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationMethodCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationMethodCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationMethodCode(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_METHOD_CODE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationMethodCode"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationTargetSiteCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationTargetSiteCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationTargetSiteCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationTargetSiteCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationTargetSiteCode(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_TARGET_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationTargetSiteCode"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationAuthor(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationAuthor(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationAuthor(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationAuthor(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationAuthor(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_AUTHOR,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationAuthor"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Non Medicinal Supply Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::NonMedicinalSupplyActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Non Medicinal Supply Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationNonMedicinalSupplyActivity"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationCaregiverCharacteristics(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Caregiver Characteristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationCaregiverCharacteristics(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CaregiverCharacteristics) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationCaregiverCharacteristics(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Caregiver Characteristics</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationCaregiverCharacteristics(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationCaregiverCharacteristics(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationCaregiverCharacteristics"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationAssessmentScaleObservation(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Assessment Scale Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationAssessmentScaleObservation(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AssessmentScaleObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationAssessmentScaleObservation(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Assessment Scale Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationAssessmentScaleObservation(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationAssessmentScaleObservation(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationAssessmentScaleObservation"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationReferenceRange(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationReferenceRange(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->exists(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationReferenceRange(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationReferenceRange(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultObservationReferenceRange(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationReferenceRange"),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range No Code</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject(code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range No Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(cognitiveStatusResultObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE,
						ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationReferenceRangeObservationRangeNoCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultObservationReferenceRangeObservationRange(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationReferenceRangeObservationRange(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null)->reject(observationRange->one(observationRange : cda::ObservationRange | not observationRange.oclIsUndefined() and observationRange.oclIsKindOf(cda::ObservationRange)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultObservationReferenceRangeObservationRange(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultObservationReferenceRangeObservationRange(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCognitiveStatusResultObservationReferenceRangeObservationRange(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(cognitiveStatusResultObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE,
						ConsolPlugin.INSTANCE.getString("CognitiveStatusResultObservationReferenceRangeObservationRange"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonMedicinalSupplyActivities(CognitiveStatusResultObservation) <em>Get Non Medicinal Supply Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivities(CognitiveStatusResultObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity)).oclAsType(consol::NonMedicinalSupplyActivity)";

	/**
	 * The cached OCL query for the '{@link #getNonMedicinalSupplyActivities(CognitiveStatusResultObservation) <em>Get Non Medicinal Supply Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivities(CognitiveStatusResultObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities(
			CognitiveStatusResultObservation cognitiveStatusResultObservation) {
		if (GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION,
				ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION.getEAllOperations().get(93));
			try {
				GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonMedicinalSupplyActivity> result = (Collection<NonMedicinalSupplyActivity>) query.evaluate(cognitiveStatusResultObservation);
		return new BasicEList.UnmodifiableEList<NonMedicinalSupplyActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCaregiverCharacteristicss(CognitiveStatusResultObservation) <em>Get Caregiver Characteristicss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(CognitiveStatusResultObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)).oclAsType(consol::CaregiverCharacteristics)";

	/**
	 * The cached OCL query for the '{@link #getCaregiverCharacteristicss(CognitiveStatusResultObservation) <em>Get Caregiver Characteristicss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(CognitiveStatusResultObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CaregiverCharacteristics> getCaregiverCharacteristicss(
			CognitiveStatusResultObservation cognitiveStatusResultObservation) {
		if (GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION,
				ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION.getEAllOperations().get(94));
			try {
				GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY = helper.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CaregiverCharacteristics> result = (Collection<CaregiverCharacteristics>) query.evaluate(cognitiveStatusResultObservation);
		return new BasicEList.UnmodifiableEList<CaregiverCharacteristics>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentScaleObservations(CognitiveStatusResultObservation) <em>Get Assessment Scale Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(CognitiveStatusResultObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentScaleObservations(CognitiveStatusResultObservation) <em>Get Assessment Scale Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(CognitiveStatusResultObservation)
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
			CognitiveStatusResultObservation cognitiveStatusResultObservation) {
		if (GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION,
				ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION.getEAllOperations().get(95));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservation> result = (Collection<AssessmentScaleObservation>) query.evaluate(cognitiveStatusResultObservation);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.74')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(CognitiveStatusResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultObservation The receiving '<em><b>Cognitive Status Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservationTemplateId(
			CognitiveStatusResultObservation cognitiveStatusResultObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ResultObservationTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									cognitiveStatusResultObservation, context) }),
					new Object[] { cognitiveStatusResultObservation }));
			}

			return false;
		}
		return true;
	}

} // CognitiveStatusResultObservationOperations
