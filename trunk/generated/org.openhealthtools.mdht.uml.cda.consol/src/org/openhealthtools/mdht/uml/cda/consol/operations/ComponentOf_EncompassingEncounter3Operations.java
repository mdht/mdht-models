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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.EncompassingEncounterOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Of Encompassing Encounter3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3#validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encompassing Encounter Has Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3#validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encompassing Encounter Has Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3#validateEncompassingEncounter3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3#validateEncompassingEncounter3ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3#validateEncompassingEncounter3EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encounter Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentOf_EncompassingEncounter3Operations extends EncompassingEncounterOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOf_EncompassingEncounter3Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encompassing Encounter Has Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encompassing Encounter Has Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.low.oclIsUndefined()
	 * @param componentOf_EncompassingEncounter3 The receiving '<em><b>Component Of Encompassing Encounter3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(
			ComponentOf_EncompassingEncounter3 componentOf_EncompassingEncounter3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter3)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3__ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow"),
						 new Object [] { componentOf_EncompassingEncounter3 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encompassing Encounter Has Effective Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encompassing Encounter Has Effective Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.high.oclIsUndefined()
	 * @param componentOf_EncompassingEncounter3 The receiving '<em><b>Component Of Encompassing Encounter3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(
			ComponentOf_EncompassingEncounter3 componentOf_EncompassingEncounter3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter3)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3__ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh"),
						 new Object [] { componentOf_EncompassingEncounter3 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter3EffectiveTime(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter3EffectiveTime(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter3EffectiveTime(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter3EffectiveTime(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param componentOf_EncompassingEncounter3 The receiving '<em><b>Component Of Encompassing Encounter3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter3EffectiveTime(
			ComponentOf_EncompassingEncounter3 componentOf_EncompassingEncounter3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter3)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3__ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter3EffectiveTime"),
						 new Object [] { componentOf_EncompassingEncounter3 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter3ResponsibleParty(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter3ResponsibleParty(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter3ResponsibleParty(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter3ResponsibleParty(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty))
	 * @param componentOf_EncompassingEncounter3 The receiving '<em><b>Component Of Encompassing Encounter3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter3ResponsibleParty(
			ComponentOf_EncompassingEncounter3 componentOf_EncompassingEncounter3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter3)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3__ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter3ResponsibleParty"),
						 new Object [] { componentOf_EncompassingEncounter3 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter3EncounterParticipant(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter3EncounterParticipant(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter3EncounterParticipant(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter3EncounterParticipant(ComponentOf_EncompassingEncounter3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant))
	 * @param componentOf_EncompassingEncounter3 The receiving '<em><b>Component Of Encompassing Encounter3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter3EncounterParticipant(
			ComponentOf_EncompassingEncounter3 componentOf_EncompassingEncounter3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter3)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3__ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter3EncounterParticipant"),
						 new Object [] { componentOf_EncompassingEncounter3 }));
			}
			return false;
		}
		return true;
	}

} // ComponentOf_EncompassingEncounter3Operations
