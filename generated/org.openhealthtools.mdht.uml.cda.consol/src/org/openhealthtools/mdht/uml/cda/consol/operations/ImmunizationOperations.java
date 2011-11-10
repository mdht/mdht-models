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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Immunization;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SubstanceAdministrationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationHasDoseQuantityOrRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Dose Quantity Or Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationHasConsents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Consents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationHasPreconditionCriterion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Precondition Criterion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationHasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationHasReasonProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Reason Problem</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationComments(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationRefusalReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationMedicationSeriesNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationPatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#validateImmunizationProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#getMedicationStatusObservation() <em>Get Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#getReactionObservations() <em>Get Reaction Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Immunization#getProductInstances() <em>Get Product Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationOperations extends SubstanceAdministrationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMoodCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMoodCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT ";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMoodCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMoodCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT 
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationMoodCode(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationMoodCode"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationHasDoseQuantityOrRateQuantity(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Dose Quantity Or Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasDoseQuantityOrRateQuantity(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.doseQuantity.oclIsUndefined() or not self.rateQuantity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationHasDoseQuantityOrRateQuantity(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Dose Quantity Or Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasDoseQuantityOrRateQuantity(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.doseQuantity.oclIsUndefined() or not self.rateQuantity.oclIsUndefined()
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationHasDoseQuantityOrRateQuantity(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("ImmunizationHasDoseQuantityOrRateQuantity"),
					new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationHasConsents(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Consents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasConsents(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getClinicalDocument().authorization->size() > 0 and self.getClinicalDocument().authorization.consent->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationHasConsents(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Consents</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasConsents(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getClinicalDocument().authorization->size() > 0 and self.getClinicalDocument().authorization.consent->size() > 0
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationHasConsents(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_HAS_CONSENTS,
					ConsolPlugin.INSTANCE.getString("ImmunizationHasConsents"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationInformationSource(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationInformationSource(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "
			+ "or not self.getSection().informant->isEmpty()"
			+ "or not self.getClinicalDocument().informant->isEmpty()"
			+ "or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"
			+ "or (self.entryRelationship->exists(rel : cda::EntryRelationship | "
			+ "   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"
			+ "   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationInformationSource(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationInformationSource(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 * or not self.getSection().informant->isEmpty()
	 * or not self.getClinicalDocument().informant->isEmpty()
	 * or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 * or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationInformationSource(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_INFORMATION_SOURCE,
					ConsolPlugin.INSTANCE.getString("ImmunizationInformationSource"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationHasPreconditionCriterion(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Precondition Criterion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasPreconditionCriterion(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.criterion.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationHasPreconditionCriterion(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Precondition Criterion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasPreconditionCriterion(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.precondition->exists(precondition : cda::Precondition | not precondition.criterion.oclIsUndefined())
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationHasPreconditionCriterion(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_HAS_PRECONDITION_CRITERION,
					ConsolPlugin.INSTANCE.getString("ImmunizationHasPreconditionCriterion"),
					new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationHasReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRel : cda::EntryRelationship | entryRel.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationHasReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRel : cda::EntryRelationship | entryRel.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationHasReason(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_HAS_REASON,
					ConsolPlugin.INSTANCE.getString("ImmunizationHasReason"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationHasReasonProblem(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Reason Problem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasReasonProblem(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->forAll(target : "
			+ "cda::ClinicalStatement | not target.oclIsUndefined() and "
			+ "  (target.oclIsKindOf(ccd::ProblemAct) or target.oclIsKindOf(ccd::ProblemObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationHasReasonProblem(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Reason Problem</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasReasonProblem(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->forAll(target : 
	 * 
	 * cda::ClinicalStatement | not target.oclIsUndefined() and 
	 *   (target.oclIsKindOf(ccd::ProblemAct) or target.oclIsKindOf(ccd::ProblemObservation)))
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationHasReasonProblem(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_HAS_REASON_PROBLEM,
					ConsolPlugin.INSTANCE.getString("ImmunizationHasReasonProblem"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationHasProduct(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasProduct(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable.manufacturedProduct.oclIsKindOf(ccd::Product)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationHasProduct(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Has Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationHasProduct(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.consumable.manufacturedProduct.oclIsKindOf(ccd::Product)
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationHasProduct(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_HAS_PRODUCT,
					ConsolPlugin.INSTANCE.getString("ImmunizationHasProduct"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationComments(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationComments(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_COMMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.negationInd=true implies not self.entryRelationship.act->select( act | act.oclIsKindOf(ccd::Comment) )->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationComments(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Comments</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationComments(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_COMMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.negationInd=true implies not self.entryRelationship.act->select( act | act.oclIsKindOf(ccd::Comment) )->isEmpty()
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationComments(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_COMMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_COMMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_COMMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_COMMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_COMMENTS,
					ConsolPlugin.INSTANCE.getString("ImmunizationComments"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationRefusalReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er |   er.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON and er.act.code.codeSystem <> '2.16.840.1.113883.1.11.19717' )->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationRefusalReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er |   er.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON and er.act.code.codeSystem <> '2.16.840.1.113883.1.11.19717' )->isEmpty()
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationRefusalReason(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_REFUSAL_REASON,
					ConsolPlugin.INSTANCE.getString("ImmunizationRefusalReason"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationTemplateId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationTemplateId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationTemplateId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationTemplateId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.13')
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationTemplateId(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ImmunizationTemplateId"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationId(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.IMMUNIZATION__IMMUNIZATION_ID,
					ConsolPlugin.INSTANCE.getString("ImmunizationId"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.codeSystem = '2.16.840.1.113883.12.292' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.12.292' and not value.code.oclIsUndefined()))
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationCode(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationCode"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationStatusCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationStatusCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationStatusCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationStatusCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationStatusCode(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationStatusCode"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationEffectiveTime(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationEffectiveTime(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationEffectiveTime(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationEffectiveTime(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationEffectiveTime(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ImmunizationEffectiveTime"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationRouteCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRouteCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.5.112'))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationRouteCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRouteCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.112'))
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationRouteCode(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_ROUTE_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationRouteCode"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMaxDoseQuantity(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMaxDoseQuantity(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMaxDoseQuantity(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMaxDoseQuantity(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationMaxDoseQuantity(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_MAX_DOSE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("ImmunizationMaxDoseQuantity"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationSeriesNumberObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationSeriesNumberObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationSeriesNumberObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationSeriesNumberObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Series Number Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationSeriesNumberObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationSeriesNumberObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationMedicationSeriesNumberObservation(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_MEDICATION_SERIES_NUMBER_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ImmunizationMedicationSeriesNumberObservation"),
					new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationStatusObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationStatusObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationStatusObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationStatusObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MedicationStatusObservation))
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationMedicationStatusObservation(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_MEDICATION_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ImmunizationMedicationStatusObservation"),
					new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationPatientInstruction(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Patient Instruction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationPatientInstruction(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PatientMedicalInstructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationPatientInstruction(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Patient Instruction</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationPatientInstruction(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PatientMedicalInstructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationPatientInstruction(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_PATIENT_INSTRUCTION,
					ConsolPlugin.INSTANCE.getString("ImmunizationPatientInstruction"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationReactionObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationReactionObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationReactionObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationReactionObservation(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationReactionObservation(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_REACTION_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ImmunizationReactionObservation"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationProductInstance(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Product Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationProductInstance(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationProductInstance(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Product Instance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationProductInstance(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationProductInstance(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION__IMMUNIZATION_PRODUCT_INSTANCE,
					ConsolPlugin.INSTANCE.getString("ImmunizationProductInstance"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationSeriesNumberObservation(Immunization) <em>Get Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation(Immunization)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(consol::MedicationSeriesNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationSeriesNumberObservation(Immunization) <em>Get Medication Series Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation(Immunization)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(consol::MedicationSeriesNumberObservation)
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationSeriesNumberObservation getMedicationSeriesNumberObservation(Immunization immunization) {
		if (GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION, ConsolPackage.Literals.IMMUNIZATION.getEAllOperations().get(72));
			try {
				GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY);
		return (MedicationSeriesNumberObservation) query.evaluate(immunization);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationStatusObservation(Immunization) <em>Get Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(Immunization)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationStatusObservation(Immunization) <em>Get Medication Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(Immunization)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MedicationStatusObservation))->asSequence()->first().oclAsType(consol::MedicationStatusObservation)
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationStatusObservation getMedicationStatusObservation(Immunization immunization) {
		if (GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION, ConsolPackage.Literals.IMMUNIZATION.getEAllOperations().get(73));
			try {
				GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY);
		return (MedicationStatusObservation) query.evaluate(immunization);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientInstructions(Immunization) <em>Get Patient Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstructions(Immunization)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PatientMedicalInstructions)).oclAsType(consol::PatientMedicalInstructions)";

	/**
	 * The cached OCL query for the '{@link #getPatientInstructions(Immunization) <em>Get Patient Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstructions(Immunization)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PatientMedicalInstructions)).oclAsType(consol::PatientMedicalInstructions)
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<PatientMedicalInstructions> getPatientInstructions(Immunization immunization) {
		if (GET_PATIENT_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION, ConsolPackage.Literals.IMMUNIZATION.getEAllOperations().get(74));
			try {
				GET_PATIENT_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_PATIENT_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_INSTRUCTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PatientMedicalInstructions> result = (Collection<PatientMedicalInstructions>) query.evaluate(immunization);
		return new BasicEList.UnmodifiableEList<PatientMedicalInstructions>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservations(Immunization) <em>Get Reaction Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations(Immunization)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer)).oclAsType(consol::ProblemEntryReactionObservationContainer)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservations(Immunization) <em>Get Reaction Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations(Immunization)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer)).oclAsType(consol::ProblemEntryReactionObservationContainer)
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProblemEntryReactionObservationContainer> getReactionObservations(Immunization immunization) {
		if (GET_REACTION_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION, ConsolPackage.Literals.IMMUNIZATION.getEAllOperations().get(75));
			try {
				GET_REACTION_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REACTION_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemEntryReactionObservationContainer> result = (Collection<ProblemEntryReactionObservationContainer>) query.evaluate(immunization);
		return new BasicEList.UnmodifiableEList<ProblemEntryReactionObservationContainer>(
			result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProductInstances(Immunization) <em>Get Product Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances(Immunization)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRODUCT_INSTANCES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)";

	/**
	 * The cached OCL query for the '{@link #getProductInstances(Immunization) <em>Get Product Instances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances(Immunization)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRODUCT_INSTANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance)).oclAsType(consol::ProductInstance)
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProductInstance> getProductInstances(Immunization immunization) {
		if (GET_PRODUCT_INSTANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION, ConsolPackage.Literals.IMMUNIZATION.getEAllOperations().get(76));
			try {
				GET_PRODUCT_INSTANCES__EOCL_QRY = helper.createQuery(GET_PRODUCT_INSTANCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRODUCT_INSTANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProductInstance> result = (Collection<ProductInstance>) query.evaluate(immunization);
		return new BasicEList.UnmodifiableEList<ProductInstance>(result.size(), result.toArray());
	}

} // ImmunizationOperations
