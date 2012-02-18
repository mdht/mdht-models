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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter5;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.EncompassingEncounterOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Of Encompassing Encounter5</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter5#validateEncompassingEncounter5Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter5 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter5#validateEncompassingEncounter5Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter5 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter5#validateEncompassingEncounter5EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter5 Encounter Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentOf_EncompassingEncounter5Operations extends EncompassingEncounterOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOf_EncompassingEncounter5Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter5Code(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter5 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter5Code(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter5Code(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter5 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter5Code(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param componentOf_EncompassingEncounter5 The receiving '<em><b>Component Of Encompassing Encounter5</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter5Code(
			ComponentOf_EncompassingEncounter5 componentOf_EncompassingEncounter5, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER5);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter5)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__ENCOMPASSING_ENCOUNTER5_CODE,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter5Code"),
						 new Object [] { componentOf_EncompassingEncounter5 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter5Location(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter5 Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter5Location(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.location->exists(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(cda::Location))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter5Location(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter5 Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter5Location(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.location->exists(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(cda::Location))
	 * @param componentOf_EncompassingEncounter5 The receiving '<em><b>Component Of Encompassing Encounter5</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter5Location(
			ComponentOf_EncompassingEncounter5 componentOf_EncompassingEncounter5, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER5);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter5)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__ENCOMPASSING_ENCOUNTER5_LOCATION,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter5Location"),
						 new Object [] { componentOf_EncompassingEncounter5 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter5EncounterParticipant(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter5 Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter5EncounterParticipant(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter5EncounterParticipant(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter5 Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter5EncounterParticipant(ComponentOf_EncompassingEncounter5, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant))
	 * @param componentOf_EncompassingEncounter5 The receiving '<em><b>Component Of Encompassing Encounter5</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter5EncounterParticipant(
			ComponentOf_EncompassingEncounter5 componentOf_EncompassingEncounter5, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER5);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter5)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter5EncounterParticipant"),
						 new Object [] { componentOf_EncompassingEncounter5 }));
			}
			return false;
		}
		return true;
	}

} // ComponentOf_EncompassingEncounter5Operations
