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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.EncompassingEncounterOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Of Encompassing Encounter4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4#validateEncompassingEncounter4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4#validateEncompassingEncounter4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4#validateEncompassingEncounter4Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4#validateEncompassingEncounter4ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4#validateEncompassingEncounter4EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Encounter Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentOf_EncompassingEncounter4Operations extends EncompassingEncounterOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOf_EncompassingEncounter4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter4EffectiveTime(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter4EffectiveTime(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter4EffectiveTime(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter4EffectiveTime(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param componentOf_EncompassingEncounter4 The receiving '<em><b>Component Of Encompassing Encounter4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter4EffectiveTime(
			ComponentOf_EncompassingEncounter4 componentOf_EncompassingEncounter4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4__ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter4EffectiveTime"),
						 new Object [] { componentOf_EncompassingEncounter4 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter4Id(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter4Id(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter4Id(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter4Id(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)
	 * @param componentOf_EncompassingEncounter4 The receiving '<em><b>Component Of Encompassing Encounter4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter4Id(
			ComponentOf_EncompassingEncounter4 componentOf_EncompassingEncounter4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4__ENCOMPASSING_ENCOUNTER4_ID,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter4Id"),
						 new Object [] { componentOf_EncompassingEncounter4 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter4Location(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter4Location(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.location->one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter4Location(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter4Location(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.location->one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(rim::Participation))
	 * @param componentOf_EncompassingEncounter4 The receiving '<em><b>Component Of Encompassing Encounter4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter4Location(
			ComponentOf_EncompassingEncounter4 componentOf_EncompassingEncounter4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4__ENCOMPASSING_ENCOUNTER4_LOCATION,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter4Location"),
						 new Object [] { componentOf_EncompassingEncounter4 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter4ResponsibleParty(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter4ResponsibleParty(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter4ResponsibleParty(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter4ResponsibleParty(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty))
	 * @param componentOf_EncompassingEncounter4 The receiving '<em><b>Component Of Encompassing Encounter4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter4ResponsibleParty(
			ComponentOf_EncompassingEncounter4 componentOf_EncompassingEncounter4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4__ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter4ResponsibleParty"),
						 new Object [] { componentOf_EncompassingEncounter4 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter4EncounterParticipant(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter4EncounterParticipant(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter4EncounterParticipant(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter4EncounterParticipant(ComponentOf_EncompassingEncounter4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant))
	 * @param componentOf_EncompassingEncounter4 The receiving '<em><b>Component Of Encompassing Encounter4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter4EncounterParticipant(
			ComponentOf_EncompassingEncounter4 componentOf_EncompassingEncounter4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(componentOf_EncompassingEncounter4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4__ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT,
						 ConsolPlugin.INSTANCE.getString("EncompassingEncounter4EncounterParticipant"),
						 new Object [] { componentOf_EncompassingEncounter4 }));
			}
			return false;
		}
		return true;
	}

} // ComponentOf_EncompassingEncounter4Operations
