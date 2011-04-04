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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Series Number Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationSeriesNumberObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationSeriesNumberObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSeriesNumberObservationTemplateId(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationTemplateId(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.46')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSeriesNumberObservationTemplateId(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationTemplateId(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.46')
	 * @param medicationSeriesNumberObservation The receiving '<em><b>Medication Series Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationSeriesNumberObservationTemplateId(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SERIES_NUMBER_OBSERVATION);
			try {
				VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationSeriesNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("MedicationSeriesNumberObservationTemplateId"),
						 new Object [] { medicationSeriesNumberObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSeriesNumberObservationClassCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationClassCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSeriesNumberObservationClassCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationClassCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param medicationSeriesNumberObservation The receiving '<em><b>Medication Series Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationSeriesNumberObservationClassCode(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SERIES_NUMBER_OBSERVATION);
			try {
				VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationSeriesNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationSeriesNumberObservationClassCode"),
						 new Object [] { medicationSeriesNumberObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSeriesNumberObservationMoodCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationMoodCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSeriesNumberObservationMoodCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationMoodCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param medicationSeriesNumberObservation The receiving '<em><b>Medication Series Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationSeriesNumberObservationMoodCode(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SERIES_NUMBER_OBSERVATION);
			try {
				VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationSeriesNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationSeriesNumberObservationMoodCode"),
						 new Object [] { medicationSeriesNumberObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSeriesNumberObservationCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '30973-2' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSeriesNumberObservationCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '30973-2' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param medicationSeriesNumberObservation The receiving '<em><b>Medication Series Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationSeriesNumberObservationCode(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SERIES_NUMBER_OBSERVATION);
			try {
				VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationSeriesNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationSeriesNumberObservationCode"),
						 new Object [] { medicationSeriesNumberObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSeriesNumberObservationStatusCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationStatusCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSeriesNumberObservationStatusCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationStatusCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param medicationSeriesNumberObservation The receiving '<em><b>Medication Series Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationSeriesNumberObservationStatusCode(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SERIES_NUMBER_OBSERVATION);
			try {
				VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationSeriesNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationSeriesNumberObservationStatusCode"),
						 new Object [] { medicationSeriesNumberObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationSeriesNumberObservationValue(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationValue(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationSeriesNumberObservationValue(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationSeriesNumberObservationValue(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))
	 * @param medicationSeriesNumberObservation The receiving '<em><b>Medication Series Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationSeriesNumberObservationValue(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_SERIES_NUMBER_OBSERVATION);
			try {
				VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationSeriesNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE,
						 ConsolPlugin.INSTANCE.getString("MedicationSeriesNumberObservationValue"),
						 new Object [] { medicationSeriesNumberObservation }));
			}
			return false;
		}
		return true;
	}

} // MedicationSeriesNumberObservationOperations