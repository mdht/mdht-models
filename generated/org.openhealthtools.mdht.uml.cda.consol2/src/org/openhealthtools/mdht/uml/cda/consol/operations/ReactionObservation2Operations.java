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
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reaction Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#getConsolProcedureActivityProcedure2s() <em>Get Consol Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#getConsolSeverityObservation2() <em>Get Consol Severity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationProcedureActivityProcedureInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationMedicationActivityInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationSeverityObservationInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationSeverityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReactionObservation2Operations extends ReactionObservationOperations {
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
	protected ReactionObservation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationCodeValueSet(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationCodeValueSet(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationCodeValueSet(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationCodeValueSet(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationCodeValueSet(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationCodeValueSet", "INFO");

		if (VALIDATE_REACTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REACTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_CODE_VALUE_SET,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationCodeValueSet"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservation2TemplateId(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservation2TemplateId(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.9' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservation2TemplateId(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservation2TemplateId(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservation2TemplateId(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservation2TemplateId", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REACTION_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservation2TemplateId"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationCodeP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationCodeP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationCodeP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationCodeP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationCodeP(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationCodeP", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REACTION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationCodeP"),
						new Object[] { reactionObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ReactionObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ReactionObservationCodeP", passToken);
				}
				passToken.add(reactionObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationStatusCodeP(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationStatusCodeP", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REACTION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationStatusCodeP"),
						new Object[] { reactionObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ReactionObservationStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ReactionObservationStatusCodeP", passToken);
				}
				passToken.add(reactionObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityProcedure2> getConsolProcedureActivityProcedure2s(
			ReactionObservation2 reactionObservation2) {

		if (GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REACTION_OBSERVATION2,
				ConsolPackage.Literals.REACTION_OBSERVATION2.getEAllOperations().get(79));
			try {
				GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityProcedure2> result = (Collection<ProcedureActivityProcedure2>) query.evaluate(
			reactionObservation2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MedicationActivity2> getConsolMedicationActivity2s(ReactionObservation2 reactionObservation2) {

		if (GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REACTION_OBSERVATION2,
				ConsolPackage.Literals.REACTION_OBSERVATION2.getEAllOperations().get(80));
			try {
				GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationActivity2> result = (Collection<MedicationActivity2>) query.evaluate(reactionObservation2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SeverityObservation2 getConsolSeverityObservation2(ReactionObservation2 reactionObservation2) {

		if (GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REACTION_OBSERVATION2,
				ConsolPackage.Literals.REACTION_OBSERVATION2.getEAllOperations().get(81));
			try {
				GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY = helper.createQuery(
					GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY);
		return (SeverityObservation2) query.evaluate(reactionObservation2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationProcedureActivityProcedureInversionInd(
			ReactionObservation2 reactionObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ReactionObservation2ReactionObservationProcedureActivityProcedureInversionInd", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND,
						ConsolPlugin.INSTANCE.getString(
							"ReactionObservation2ReactionObservationProcedureActivityProcedureInversionInd"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationMedicationActivityInversionInd(
			ReactionObservation2 reactionObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ReactionObservation2ReactionObservationMedicationActivityInversionInd", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND,
						ConsolPlugin.INSTANCE.getString(
							"ReactionObservation2ReactionObservationMedicationActivityInversionInd"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationSeverityObservationInversionInd(
			ReactionObservation2 reactionObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ReactionObservation2ReactionObservationSeverityObservationInversionInd", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND,
						ConsolPlugin.INSTANCE.getString(
							"ReactionObservation2ReactionObservationSeverityObservationInversionInd"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationTextReference(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationTextReference", "INFO");

		if (VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_TEXT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationTextReference"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationTextReferenceValue(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationTextReferenceValue", "INFO");

		if (VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationTextReferenceValue"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationReferenceValue(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationReferenceValue", "INFO");

		if (VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationReferenceValue"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationCode(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ReactionObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(reactionObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationCode", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationCode"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationId(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationId", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_ID,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationId"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationStatusCodeP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationStatusCodeP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationStatusCodeP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationStatusCodeP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #getConsolProcedureActivityProcedure2s(ReactionObservation2) <em>Get Consol Procedure Activity Procedure2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProcedureActivityProcedure2s(ReactionObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)).oclAsType(consol::ProcedureActivityProcedure2)";

	/**
	 * The cached OCL query for the '{@link #getConsolProcedureActivityProcedure2s(ReactionObservation2) <em>Get Consol Procedure Activity Procedure2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProcedureActivityProcedure2s(ReactionObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getConsolMedicationActivity2s(ReactionObservation2) <em>Get Consol Medication Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationActivity2s(ReactionObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)).oclAsType(consol::MedicationActivity2)";

	/**
	 * The cached OCL query for the '{@link #getConsolMedicationActivity2s(ReactionObservation2) <em>Get Consol Medication Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationActivity2s(ReactionObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getConsolSeverityObservation2(ReactionObservation2) <em>Get Consol Severity Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolSeverityObservation2(ReactionObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation2))->asSequence()->any(true).oclAsType(consol::SeverityObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolSeverityObservation2(ReactionObservation2) <em>Get Consol Severity Observation2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolSeverityObservation2(ReactionObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationProcedureActivityProcedureInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationProcedureActivityProcedureInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.procedure.oclIsTypeOf(consol::ProcedureActivityProcedure2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationProcedureActivityProcedureInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationProcedureActivityProcedureInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationMedicationActivityInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationMedicationActivityInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.substanceAdministration.oclIsTypeOf(consol::MedicationActivity2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationMedicationActivityInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationMedicationActivityInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationSeverityObservationInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationSeverityObservationInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::SeverityObservation2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationSeverityObservationInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationSeverityObservationInversionInd(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationTextReference(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationTextReference(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationTextReference(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationTextReference(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationTextReferenceValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationTextReferenceValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationTextReferenceValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationTextReferenceValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationReferenceValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationReferenceValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationReferenceValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationReferenceValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationCode(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationCode(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationCode(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationCode(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationId(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationId(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationId(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationId(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationText(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationText(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (true)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationText(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationText(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationText(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationText", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_TEXT,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationText"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationStatusCode(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationStatusCode(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationStatusCode(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationStatusCode(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationStatusCode(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ReactionObservationStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(reactionObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationStatusCode", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationStatusCode"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationValueP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationValueP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationValueP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationValueP(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationValueP(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationValueP", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REACTION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationValueP"),
						new Object[] { reactionObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ReactionObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ReactionObservationValueP", passToken);
				}
				passToken.add(reactionObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationValue(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationValue(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ReactionObservationValueP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(reactionObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationValue", "ERROR");

		if (VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationValue"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationProcedureActivityProcedure(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationProcedureActivityProcedure(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(consol::ProcedureActivityProcedure2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationProcedureActivityProcedure(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationProcedureActivityProcedure(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationProcedureActivityProcedure(
			ReactionObservation2 reactionObservation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationProcedureActivityProcedure", "INFO");

		if (VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE,
						ConsolPlugin.INSTANCE.getString(
							"ReactionObservation2ReactionObservationProcedureActivityProcedure"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationMedicationActivity(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationMedicationActivity(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationMedicationActivity(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationMedicationActivity(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationMedicationActivity(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationMedicationActivity", "INFO");

		if (VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_MEDICATION_ACTIVITY,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationMedicationActivity"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationSeverityObservation(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationSeverityObservation(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationSeverityObservation(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationSeverityObservation(ReactionObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reactionObservation2 The receiving '<em><b>Reaction Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReactionObservationSeverityObservation(ReactionObservation2 reactionObservation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ReactionObservation2ReactionObservationSeverityObservation", "INFO");

		if (VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION2);
			try {
				VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reactionObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.REACTION_OBSERVATION2__REACTION_OBSERVATION_SEVERITY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("ReactionObservation2ReactionObservationSeverityObservation"),
						new Object[] { reactionObservation2 }));
			}

			return false;
		}
		return true;
	}

} // ReactionObservation2Operations
