/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservation2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservation2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 CD Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 Entry Relationship Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 Entry Relationship Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberOfPressureUlcersObservation2Operations extends NumberOfPressureUlcersObservationOperations {
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
	protected NumberOfPressureUlcersObservation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservation2TemplateId(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservation2TemplateId(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.76' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservation2TemplateId(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservation2TemplateId(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservation2TemplateId(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
			try {
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberOfPressureUlcersObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservation2TemplateId"),
						new Object[] { numberOfPressureUlcersObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservation2CDTranslation(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 CD Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservation2CDTranslation(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1 and translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.code = '75277-4' and value.codeSystem = '2.16.840.1.113883.6.1')) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservation2CDTranslation(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 CD Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservation2CDTranslation(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservation2CDTranslation(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			numberOfPressureUlcersObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservation2CDTranslation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservation2CDTranslationP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 CD Translation P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservation2CDTranslationP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() =  1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservation2CDTranslationP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 CD Translation P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservation2CDTranslationP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservation2CDTranslationP(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			numberOfPressureUlcersObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION_P,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservation2CDTranslationP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 Entry Relationship Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 Entry Relationship Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			numberOfPressureUlcersObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 Entry Relationship Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = code.oclAsType(datatypes::CD) in " +
			"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 Entry Relationship Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCode(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			numberOfPressureUlcersObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservation2EntryRelationshipObservationCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationCodeP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationCodeP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationCodeP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationCodeP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationCodeP(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
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
				numberOfPressureUlcersObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservationCodeP"),
						new Object[] { numberOfPressureUlcersObservation2 }));
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
				passToken.add(numberOfPressureUlcersObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '2264892003' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationCode(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(numberOfPressureUlcersObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
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
				numberOfPressureUlcersObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservationCode"),
						new Object[] { numberOfPressureUlcersObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationship(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationship(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationship(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationship(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPressureUlcersObservationEntryRelationship(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
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
				numberOfPressureUlcersObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP,
						ConsolPlugin.INSTANCE.getString(
							"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservationEntryRelationship"),
						new Object[] { numberOfPressureUlcersObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
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
			numberOfPressureUlcersObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservationEntryRelationshipObservationClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
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
			numberOfPressureUlcersObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (not value->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
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
			numberOfPressureUlcersObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservationEntryRelationshipObservationValueP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservationEntryRelationshipObservationValueP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservationEntryRelationshipObservationValueP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '421076008' or value.code = '420324007' or value.code = '421927004' or value.code = '420597008' or value.code = '421594008'))))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
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
			numberOfPressureUlcersObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservationEntryRelationshipObservationValueP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservationEntryRelationshipObservationValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
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
			numberOfPressureUlcersObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservationEntryRelationshipTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservation(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservation(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPressureUlcersObservationEntryRelationshipObservation(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPressureUlcersObservationEntryRelationshipObservation(NumberOfPressureUlcersObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPressureUlcersObservation2 The receiving '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservation(
			NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2);
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
			numberOfPressureUlcersObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION,
							ConsolPlugin.INSTANCE.getString(
								"NumberOfPressureUlcersObservation2NumberOfPressureUlcersObservationEntryRelationshipObservation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // NumberOfPressureUlcersObservation2Operations
