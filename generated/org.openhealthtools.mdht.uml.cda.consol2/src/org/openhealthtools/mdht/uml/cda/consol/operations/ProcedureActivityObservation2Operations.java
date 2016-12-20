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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2CodeSuggestedCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Code Suggested Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2ReactionObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2ANYNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 ANY Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#getConsolInstruction2() <em>Get Consol Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#getReactionObservation2s() <em>Get Reaction Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityObservation2Operations extends ProcedureActivityObservationOperations {
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
	protected ProcedureActivityObservation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservation2CodeSuggestedCodeSystems(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Code Suggested Code Systems</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservation2CodeSuggestedCodeSystems(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_CODE_SUGGESTED_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not code.oclIsUndefined() and self.code.isNullFlavorUndefined() implies self.code.codeSystem = '2.16.840.1.113883.6.12' or self.code.codeSystem = '2.16.840.1.113883.6.4' or self.code.codeSystem = '2.16.840.1.113883.6.13'";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservation2CodeSuggestedCodeSystems(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Code Suggested Code Systems</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservation2CodeSuggestedCodeSystems(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_CODE_SUGGESTED_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservation2CodeSuggestedCodeSystems(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_CODE_SUGGESTED_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_CODE_SUGGESTED_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_CODE_SUGGESTED_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_CODE_SUGGESTED_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION2_CODE_SUGGESTED_CODE_SYSTEMS,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservation2CodeSuggestedCodeSystems"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationStatusCodeP(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationStatusCodeP"),
						new Object[] { procedureActivityObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationStatusCodeP", passToken);
				}
				passToken.add(procedureActivityObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservation2AuthorParticipation(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION2_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservation2AuthorParticipation"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservation2ReactionObservation2(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION2_REACTION_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservation2ReactionObservation2"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservation2ANYNullFlavor(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_ANY_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_ANY_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_ANY_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_ANY_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			procedureActivityObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION2_ANY_NULL_FLAVOR,
							ConsolPlugin.INSTANCE.getString(
								"ProcedureActivityObservation2ProcedureActivityObservation2ANYNullFlavor"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getConsolIndication2s(
			ProcedureActivityObservation2 procedureActivityObservation2) {

		if (GET_CONSOL_INDICATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2,
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2.getEAllOperations().get(102));
			try {
				GET_CONSOL_INDICATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(procedureActivityObservation2);
		return new BasicEList.UnmodifiableEList<Indication2>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MedicationActivity2> getConsolMedicationActivity2s(
			ProcedureActivityObservation2 procedureActivityObservation2) {

		if (GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2,
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2.getEAllOperations().get(103));
			try {
				GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationActivity2> result = (Collection<MedicationActivity2>) query.evaluate(
			procedureActivityObservation2);
		return new BasicEList.UnmodifiableEList<MedicationActivity2>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Instruction2 getConsolInstruction2(ProcedureActivityObservation2 procedureActivityObservation2) {

		if (GET_CONSOL_INSTRUCTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2,
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2.getEAllOperations().get(104));
			try {
				GET_CONSOL_INSTRUCTION2__EOCL_QRY = helper.createQuery(GET_CONSOL_INSTRUCTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_INSTRUCTION2__EOCL_QRY);
		return (Instruction2) query.evaluate(procedureActivityObservation2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ReactionObservation2> getReactionObservation2s(
			ProcedureActivityObservation2 procedureActivityObservation2) {

		if (GET_REACTION_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2,
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2.getEAllOperations().get(105));
			try {
				GET_REACTION_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_REACTION_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ReactionObservation2> result = (Collection<ReactionObservation2>) query.evaluate(
			procedureActivityObservation2);
		return new BasicEList.UnmodifiableEList<ReactionObservation2>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationInstructionsInversion(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationInstructionsInversion"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationCodeCodeSystems(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationCodeCodeSystems"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationTemplateId(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationTemplateId"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationTargetSiteCodeP(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationTargetSiteCodeP"),
						new Object[] { procedureActivityObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationTargetSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationTargetSiteCodeP",
						passToken);
				}
				passToken.add(procedureActivityObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationTargetSiteCode(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationTargetSiteCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(procedureActivityObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationTargetSiteCode"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationMoodCode(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationMoodCode"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationStatusCodeP(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationStatusCodeP(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationStatusCodeP(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationStatusCodeP(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservation2AuthorParticipation(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservation2AuthorParticipation(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservation2AuthorParticipation(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservation2AuthorParticipation(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservation2ReactionObservation2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Reaction Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservation2ReactionObservation2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservation2ReactionObservation2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Reaction Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservation2ReactionObservation2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservation2ANYNullFlavor(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 ANY Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservation2ANYNullFlavor(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_ANY_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (isDefined('nullFlavor') )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservation2ANYNullFlavor(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 ANY Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservation2ANYNullFlavor(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_ANY_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * The cached OCL expression body for the '{@link #getConsolIndication2s(ProcedureActivityObservation2) <em>Get Consol Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getConsolIndication2s(ProcedureActivityObservation2) <em>Get Consol Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INDICATION2S__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getConsolMedicationActivity2s(ProcedureActivityObservation2) <em>Get Consol Medication Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationActivity2s(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)).oclAsType(consol::MedicationActivity2)";

	/**
	 * The cached OCL query for the '{@link #getConsolMedicationActivity2s(ProcedureActivityObservation2) <em>Get Consol Medication Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationActivity2s(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getConsolInstruction2(ProcedureActivityObservation2) <em>Get Consol Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INSTRUCTION2__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2))->asSequence()->any(true).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getConsolInstruction2(ProcedureActivityObservation2) <em>Get Consol Instruction2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INSTRUCTION2__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservation2s(ProcedureActivityObservation2) <em>Get Reaction Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation2s(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)).oclAsType(consol::ReactionObservation2)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservation2s(ProcedureActivityObservation2) <em>Get Reaction Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation2s(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATION2S__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationInstructionsInversion(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions Inversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationInstructionsInversion(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instruction2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationInstructionsInversion(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions Inversion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationInstructionsInversion(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationCodeCodeSystems(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Code Systems</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationCodeCodeSystems(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.isNullFlavorDefined() or self.code.codeSystem = '2.16.840.1.113883.6.1' xor self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationCodeCodeSystems(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Code Systems</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationCodeCodeSystems(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.13' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationTargetSiteCodeP(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationTargetSiteCodeP(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationTargetSiteCodeP(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationTargetSiteCodeP(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationMoodCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationMoodCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationMoodCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationMoodCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationStatusCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationStatusCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"value.code = 'completed' or value.code = 'active' or value.code = 'aborted' or value.code = 'cancelled')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationStatusCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationStatusCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationStatusCode(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationStatusCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(procedureActivityObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationStatusCode"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationValue(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationValue(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationValue(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationValue(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationValue(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationValue"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationIndication(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationIndication(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationIndication(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationIndication(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationIndication(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_INDICATION,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationIndication"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationMedicationActivity(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationMedicationActivity(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationMedicationActivity(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationMedicationActivity(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationMedicationActivity(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationMedicationActivity"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationInstructions(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationInstructions(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationInstructions(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationInstructions(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationInstructions(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationInstructions"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationPerformer(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationPerformer(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationPerformer(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationPerformer(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationPerformer(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureActivityObservation2ProcedureActivityObservationPerformer"),
						new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (( not addr->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			procedureActivityObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR,
							ConsolPlugin.INSTANCE.getString(
								"ProcedureActivityObservation2ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (( not telecom->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			procedureActivityObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM,
							ConsolPlugin.INSTANCE.getString(
								"ProcedureActivityObservation2ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			procedureActivityObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"ProcedureActivityObservation2ProcedureActivityObservationProcedureObservationPerformerAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // ProcedureActivityObservation2Operations
