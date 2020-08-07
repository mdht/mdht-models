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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Number Of Pressure Ulcers Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberOfPressureUlcersObservationOperations extends ClinicalStatementOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOfPressureUlcersObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationTemplateId(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationTemplateId(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.76')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationTemplateId(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationTemplateId(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationTemplateId(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationTemplateId", "ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationTemplateId"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationClassCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationClassCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationClassCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationClassCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationClassCode(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationClassCode", "ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationClassCode"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationMoodCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationMoodCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationMoodCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationMoodCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationMoodCode(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationMoodCode", "ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationMoodCode"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationId(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationId(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationId(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationId(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationId(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationId", "ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ID,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationId"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationCodeP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationCodeP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationCodeP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationCodeP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationCodeP(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationCodeP", "ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationCodeP"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservationCodeP", passToken);
				}
				passToken.add(numberOfPressureUlcersObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '2264892003' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationCode(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(numberOfPressureUlcersObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationCode", "ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationCode"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationStatusCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationStatusCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationStatusCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationStatusCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationStatusCode(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationStatusCode", "ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationStatusCode"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationStatusCodeP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationStatusCodeP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationStatusCodeP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationStatusCodeP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationStatusCodeP(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationStatusCodeP", "ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationStatusCodeP"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEffectiveTime(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEffectiveTime(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEffectiveTime(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEffectiveTime(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationEffectiveTime(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEffectiveTime", "ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEffectiveTime"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationValue(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationValue(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationValue(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationValue(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationValue(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationValue", "ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationValue"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationAuthor(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationAuthor(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationAuthor(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationAuthor(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationAuthor(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationAuthor", "INFO");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_AUTHOR,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationAuthor"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationship(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationship(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationship(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationship(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationEntryRelationship(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationship", "ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationship"),
						new Object[] { numberOfPressureUlcersObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode",
			"ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			numberOfPressureUlcersObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode",
			"ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			numberOfPressureUlcersObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '421076008' or value.code = '420324007' or value.code = '421927004' or value.code = '420597008' or value.code = '421594008'))))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipObservationValue",
			"WARNING");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			numberOfPressureUlcersObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipObservationValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() =  1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipObservationValueP",
			"ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			numberOfPressureUlcersObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipObservationValueP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipTypeCode",
			"ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			numberOfPressureUlcersObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservation(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservation(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservation(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservation(NumberOfPressureUlcersObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation The receiving '<em><b>Number Of Pressure Ulcers Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservation(
			NumberOfPressureUlcersObservation numberOfPressureUlcersObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipObservation",
			"ERROR");

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			numberOfPressureUlcersObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservationNumberOfPressureUlcersObservationEntryRelationshipObservation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // NumberOfPressureUlcersObservationOperations
