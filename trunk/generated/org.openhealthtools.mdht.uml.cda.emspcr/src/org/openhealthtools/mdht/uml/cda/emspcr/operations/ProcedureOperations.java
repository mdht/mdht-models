/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedureOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureEmspcrProcedureAbandonedProcedureRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Abandoned Procedure Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureEmspcrProcedureProcedurePriorRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Prior Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureEmspcrProcedureProcedureNumberOfAttemptsRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Number Of Attempts Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureEmspcrProcedureProcedureSuccessfulRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Successful Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureEmspcrProcedureProcedureComplicationsRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Complications Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureEmspcrProcedureProcedurePatientResponseRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Patient Response Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureEmspcrProcedureProcedurePerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureEmspcrProcedureAirwayConfirmationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Airway Confirmation Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEmspcrProcedureNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Negation Ind</em>}</li>
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
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureEmspcrProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Abandoned Procedure Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureEmspcrProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Abandoned Procedure Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEmspcrProcedureEmspcrProcedureAbandonedProcedureRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", new Object[] {
								"EmspcrProcedureEmspcrProcedureAbandonedProcedureRelationship",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Prior Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Prior Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEmspcrProcedureEmspcrProcedureProcedurePriorRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", new Object[] {
								"EmspcrProcedureEmspcrProcedureProcedurePriorRelationship",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Number Of Attempts Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Number Of Attempts Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEmspcrProcedureEmspcrProcedureProcedureNumberOfAttemptsRelationship(
			Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", new Object[] {
								"EmspcrProcedureEmspcrProcedureProcedureNumberOfAttemptsRelationship",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Successful Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Successful Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEmspcrProcedureEmspcrProcedureProcedureSuccessfulRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", new Object[] {
								"EmspcrProcedureEmspcrProcedureProcedureSuccessfulRelationship",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Complications Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Complications Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEmspcrProcedureEmspcrProcedureProcedureComplicationsRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", new Object[] {
								"EmspcrProcedureEmspcrProcedureProcedureComplicationsRelationship",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Patient Response Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Patient Response Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEmspcrProcedureEmspcrProcedureProcedurePatientResponseRelationship(
			Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", new Object[] {
								"EmspcrProcedureEmspcrProcedureProcedurePatientResponseRelationship",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Performer</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureEmspcrProcedureProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Procedure Performer</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEmspcrProcedureEmspcrProcedureProcedurePerformer(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", new Object[] {
								"EmspcrProcedureEmspcrProcedureProcedurePerformer",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureEmspcrProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Airway Confirmation Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureEmspcrProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Emspcr Procedure Airway Confirmation Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEmspcrProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEmspcrProcedureEmspcrProcedureAirwayConfirmationRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", new Object[] {
								"EmspcrProcedureEmspcrProcedureAirwayConfirmationRelationship",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
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

	public static boolean validateEmspcrProcedureCode(Procedure procedure, DiagnosticChain diagnostics,
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
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"EmspcrProcedureCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
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

	public static boolean validateEmspcrProcedureEffectiveTime(Procedure procedure, DiagnosticChain diagnostics,
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
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"EmspcrProcedureEffectiveTime",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureStatusCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Status Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureStatusCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureStatusCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Status Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureStatusCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
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

	public static boolean validateEmspcrProcedureStatusCodeP(Procedure procedure, DiagnosticChain diagnostics,
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
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_STATUS_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"EmspcrProcedureStatusCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Status Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'Aborted')";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Status Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
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

	public static boolean validateEmspcrProcedureStatusCode(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

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
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"EmspcrProcedureStatusCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Approach Site Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Approach Site Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
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

	public static boolean validateEmspcrProcedureApproachSiteCodeP(Procedure procedure, DiagnosticChain diagnostics,
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
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_APPROACH_SITE_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"EmspcrProcedureApproachSiteCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Approach Site Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA18112-5' or value.code = 'LA18113-3' or value.code = 'LA18757-7' or value.code = 'LA18758-5' or value.code = 'LA18790-8' or value.code = 'LA18791-6' or value.code = 'LA18792-4' or value.code = 'LA18793-2' or value.code = 'LA18794-0' or value.code = 'LA18795-7' or value.code = 'LA18796-5' or value.code = 'LA18797-3' or value.code = 'LA18798-1' or value.code = 'LA18799-9' or value.code = 'LA18800-5' or value.code = 'LA18801-3' or value.code = 'LA18802-1' or value.code = 'LA18803-9' or value.code = 'LA18804-7' or value.code = 'LA18805-4' or value.code = 'LA18806-2' or value.code = 'LA18807-0' or value.code = 'LA18808-8' or value.code = 'LA18809-6' or value.code = 'LA18810-4' or value.code = 'LA18811-2' or value.code = 'LA18812-0' or value.code = 'LA18813-8' or value.code = 'LA18814-6' or value.code = 'LA18815-3' or value.code = 'LA18816-1' or value.code = 'LA18817-9' or value.code = 'LA18818-7')))";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Approach Site Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
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

	public static boolean validateEmspcrProcedureApproachSiteCode(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

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
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"EmspcrProcedureApproachSiteCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEmspcrProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Negation Ind</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateEmspcrProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emspcr Procedure Negation Ind</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEmspcrProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
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

	public static boolean validateEmspcrProcedureNegationInd(Procedure procedure, DiagnosticChain diagnostics,
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
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE__EMSPCR_PROCEDURE_NEGATION_IND,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"EmspcrProcedureNegationInd",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
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
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ProcedureActivityProcedureTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedure, context) }),
					new Object[] { procedure }));
			}

			return false;
		}
		return true;
	}

} // ProcedureOperations
