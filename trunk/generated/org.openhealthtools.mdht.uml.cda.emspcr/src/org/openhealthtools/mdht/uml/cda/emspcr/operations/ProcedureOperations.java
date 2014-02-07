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

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedureOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.Procedure;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureAbandonedProcedureRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Abandoned Procedure Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedurePriorRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Prior Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedureNumberOfAttemptsRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Number Of Attempts Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedureSuccessfulRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Successful Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedureComplicationsRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Complications Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedurePatientResponseRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Patient Response Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedurePerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureAirwayConfirmationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Airway Confirmation Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureReasonProcedureNotAttemptedRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Reason Procedure Not Attempted Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureOperations extends ProcedureActivityProcedureOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Abandoned Procedure Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Abandoned Procedure Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureAbandonedProcedureRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureAbandonedProcedureRelationship"),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Prior Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Prior Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureProcedurePriorRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureProcedurePriorRelationship"),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Number Of Attempts Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Number Of Attempts Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureProcedureNumberOfAttemptsRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureProcedureNumberOfAttemptsRelationship"),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Successful Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Successful Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureProcedureSuccessfulRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureProcedureSuccessfulRelationship"),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Complications Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Complications Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureProcedureComplicationsRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureProcedureComplicationsRelationship"),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Patient Response Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Patient Response Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureProcedurePatientResponseRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureProcedurePatientResponseRelationship"),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureProcedurePerformer(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_PROCEDURE_PERFORMER,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureProcedurePerformer"), new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Airway Confirmation Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Airway Confirmation Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureAirwayConfirmationRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureAirwayConfirmationRelationship"),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureReasonProcedureNotAttemptedRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Reason Procedure Not Attempted Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureReasonProcedureNotAttemptedRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureReasonProcedureNotAttemptedRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Reason Procedure Not Attempted Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureReasonProcedureNotAttemptedRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureReasonProcedureNotAttemptedRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureReasonProcedureNotAttemptedRelationship"),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureCode(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureCode"), new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureNegationInd(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_NEGATION_IND,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureNegationInd"), new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureStatusCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureStatusCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureStatusCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureStatusCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureStatusCodeP(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_STATUS_CODE_P,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureStatusCodeP"), new Object[] { procedure }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.EMSPCRProcedureStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.EMSPCRProcedureStatusCodeP", passToken);
				}
				passToken.add(procedure);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'Aborted')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureStatusCode(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.EMSPCRProcedureStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(procedure)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_STATUS_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureStatusCode"), new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureEffectiveTime(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureEffectiveTime"), new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Approach Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Approach Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureApproachSiteCodeP(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_APPROACH_SITE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureApproachSiteCodeP"), new Object[] { procedure }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.EMSPCRProcedureApproachSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.EMSPCRProcedureApproachSiteCodeP", passToken);
				}
				passToken.add(procedure);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPCRProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA18112-5' or value.code = 'LA18113-3' or value.code = 'LA18757-7' or value.code = 'LA18758-5' or value.code = 'LA18790-8' or value.code = 'LA18791-6' or value.code = 'LA18792-4' or value.code = 'LA18793-2' or value.code = 'LA18794-0' or value.code = 'LA18795-7' or value.code = 'LA18796-5' or value.code = 'LA18797-3' or value.code = 'LA18798-1' or value.code = 'LA18799-9' or value.code = 'LA18800-5' or value.code = 'LA18801-3' or value.code = 'LA18802-1' or value.code = 'LA18803-9' or value.code = 'LA18804-7' or value.code = 'LA18805-4' or value.code = 'LA18806-2' or value.code = 'LA18807-0' or value.code = 'LA18808-8' or value.code = 'LA18809-6' or value.code = 'LA18810-4' or value.code = 'LA18811-2' or value.code = 'LA18812-0' or value.code = 'LA18813-8' or value.code = 'LA18814-6' or value.code = 'LA18815-3' or value.code = 'LA18816-1' or value.code = 'LA18817-9' or value.code = 'LA18818-7')))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPCRProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPCRProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPCRProcedureApproachSiteCode(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.EMSPCRProcedureApproachSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(procedure)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_APPROACH_SITE_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSPCRProcedureApproachSiteCode"), new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.98')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityProcedureTemplateId(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ProcedureActivityProcedureTemplateId"), new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

} // ProcedureOperations
