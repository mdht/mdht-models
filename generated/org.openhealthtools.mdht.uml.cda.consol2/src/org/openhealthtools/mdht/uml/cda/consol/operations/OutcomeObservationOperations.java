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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ActReference;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Outcome Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationActReference2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getActReferences() <em>Get Act References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getActReference2s() <em>Get Act Reference2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutcomeObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutcomeObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationTemplateId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationTemplateId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.144')";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationTemplateId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationTemplateId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationTemplateId(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationTemplateId"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationClassCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationClassCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationClassCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationClassCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationClassCode(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationClassCode"), new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationMoodCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationMoodCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationMoodCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationMoodCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationMoodCode(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationMoodCode"), new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationId(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationId"), new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationActReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationActReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::ActReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::GEVL)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationActReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationActReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationActReference(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_ACT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationActReference"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationActReference2(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationActReference2(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::ActReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationActReference2(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationActReference2(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationActReference2(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_ACT_REFERENCE2,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationActReference2"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getActReferences(OutcomeObservation) <em>Get Act References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReferences(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACT_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ActReference)).oclAsType(consol::ActReference)";

	/**
	 * The cached OCL query for the '{@link #getActReferences(OutcomeObservation) <em>Get Act References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReferences(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACT_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ActReference> getActReferences(OutcomeObservation outcomeObservation) {
		if (GET_ACT_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OUTCOME_OBSERVATION,
				ConsolPackage.Literals.OUTCOME_OBSERVATION.getEAllOperations().get(57));
			try {
				GET_ACT_REFERENCES__EOCL_QRY = helper.createQuery(GET_ACT_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACT_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ActReference> result = (Collection<ActReference>) query.evaluate(outcomeObservation);
		return new BasicEList.UnmodifiableEList<ActReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getActReference2s(OutcomeObservation) <em>Get Act Reference2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReference2s(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACT_REFERENCE2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ActReference)).oclAsType(consol::ActReference)";

	/**
	 * The cached OCL query for the '{@link #getActReference2s(OutcomeObservation) <em>Get Act Reference2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReference2s(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACT_REFERENCE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ActReference> getActReference2s(OutcomeObservation outcomeObservation) {
		if (GET_ACT_REFERENCE2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OUTCOME_OBSERVATION,
				ConsolPackage.Literals.OUTCOME_OBSERVATION.getEAllOperations().get(58));
			try {
				GET_ACT_REFERENCE2S__EOCL_QRY = helper.createQuery(GET_ACT_REFERENCE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACT_REFERENCE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ActReference> result = (Collection<ActReference>) query.evaluate(outcomeObservation);
		return new BasicEList.UnmodifiableEList<ActReference>(result.size(), result.toArray());
	}

} // OutcomeObservationOperations
