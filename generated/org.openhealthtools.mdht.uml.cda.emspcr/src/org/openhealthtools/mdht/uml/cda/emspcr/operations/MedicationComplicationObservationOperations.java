/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Complication Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationComplicationObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationComplicationObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationComplicationObservationTemplateId(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationTemplateId(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.107')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationComplicationObservationTemplateId(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationTemplateId(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationComplicationObservation The receiving '<em><b>Medication Complication Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationComplicationObservationTemplateId(
			MedicationComplicationObservation medicationComplicationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_COMPLICATION_OBSERVATION);
			try {
				VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationComplicationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_COMPLICATION_OBSERVATION__MEDICATION_COMPLICATION_OBSERVATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("MedicationComplicationObservationTemplateId"),
					new Object[] { medicationComplicationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationComplicationObservationMoodCode(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationMoodCode(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationComplicationObservationMoodCode(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationMoodCode(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationComplicationObservation The receiving '<em><b>Medication Complication Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationComplicationObservationMoodCode(
			MedicationComplicationObservation medicationComplicationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_COMPLICATION_OBSERVATION);
			try {
				VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationComplicationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_COMPLICATION_OBSERVATION__MEDICATION_COMPLICATION_OBSERVATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("MedicationComplicationObservationMoodCode"),
					new Object[] { medicationComplicationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationComplicationObservationCodeP(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationCodeP(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationComplicationObservationCodeP(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationCodeP(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationComplicationObservation The receiving '<em><b>Medication Complication Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationComplicationObservationCodeP(
			MedicationComplicationObservation medicationComplicationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_COMPLICATION_OBSERVATION);
			try {
				VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationComplicationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_COMPLICATION_OBSERVATION__MEDICATION_COMPLICATION_OBSERVATION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("MedicationComplicationObservationCodeP"),
					new Object[] { medicationComplicationObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservationCodeP", passToken);
				}
				passToken.add(medicationComplicationObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationComplicationObservationCode(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationCode(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67541-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationComplicationObservationCode(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationCode(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationComplicationObservation The receiving '<em><b>Medication Complication Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationComplicationObservationCode(
			MedicationComplicationObservation medicationComplicationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(medicationComplicationObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_COMPLICATION_OBSERVATION);
			try {
				VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationComplicationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_COMPLICATION_OBSERVATION__MEDICATION_COMPLICATION_OBSERVATION_CODE,
					EmspcrPlugin.INSTANCE.getString("MedicationComplicationObservationCode"),
					new Object[] { medicationComplicationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationComplicationObservationValue(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationValue(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA137-2' or value.code = 'LA15098-9' or value.code = 'LA15099-7' or value.code = 'LA15424-7' or value.code = 'LA17059-9' or value.code = 'LA17392-4' or value.code = 'LA17393-2' or value.code = 'LA17394-0' or value.code = 'LA17396-5' or value.code = 'TMP-LA17397-3a' or value.code = 'LA17713-1' or value.code = 'LA17714-9' or value.code = 'LA18266-9' or value.code = 'LA18267-7' or value.code = 'LA7418-2' or value.code = 'LA7434-9' or value.code = 'LA7443-0' or value.code = 'LA7444-8' or value.code = 'LA9540-1' or value.code = 'LA9541-9' or value.code = 'LA9548-4' or value.code = 'TMP-LA17397-3b')))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationComplicationObservationValue(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationValue(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationComplicationObservation The receiving '<em><b>Medication Complication Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationComplicationObservationValue(
			MedicationComplicationObservation medicationComplicationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_COMPLICATION_OBSERVATION);
			try {
				VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationComplicationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_COMPLICATION_OBSERVATION__MEDICATION_COMPLICATION_OBSERVATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("MedicationComplicationObservationValue"),
					new Object[] { medicationComplicationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationComplicationObservationValueP(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationValueP(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationComplicationObservationValueP(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationComplicationObservationValueP(MedicationComplicationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationComplicationObservation The receiving '<em><b>Medication Complication Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationComplicationObservationValueP(
			MedicationComplicationObservation medicationComplicationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_COMPLICATION_OBSERVATION);
			try {
				VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationComplicationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MEDICATION_COMPLICATION_OBSERVATION__MEDICATION_COMPLICATION_OBSERVATION_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("MedicationComplicationObservationValueP"),
					new Object[] { medicationComplicationObservation }));
			}

			return false;
		}
		return true;
	}

} // MedicationComplicationObservationOperations
